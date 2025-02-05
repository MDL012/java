

const app = Vue.createApp({
data() {
        return{
            monsterHealthPoint: 100,
            playerHealthPoint: 100,
            playerSpecialAttackCooldown: 0,
            winner: null,
            logs: [],
            rounde: 0
        }
    
    },
    watch: {
        monsterHealthPoint(value) {
            if (value == 0 && this.playerHealthPoint == 0){
                this.winner = "It's draw"
            }
            if (value == 0){
                this.winner = "You won"
            }
        },
        playerHealthPoint(value) {
            if (value == 0 && this.monsterHealthPoint == 0){
                this.winner = "It's draw"
            }
            if (value == 0){
                this.winner = "Monster win!"
            }
        },
    },
    methods: {
        playerAttack() {
            const damage = getRandomNumber(5, 12);
            this.monsterHealthPoint = Math.max(this.monsterHealthPoint - damage, 0);
            this.playerSpecialAttackCooldown = Math.max(this.playerSpecialAttackCooldown - 1, 0);
            this.logs.unshift("Player Attak - " + damage)
            this.monsterAttack();
            
        },
        playerHeal() {
            const heal = getRandomNumber(8, 20);
            this.playerHealthPoint = Math.min(this.playerHealthPoint + heal, 100);
            this.playerSpecialAttackCooldown = Math.max(this.playerSpecialAttackCooldown - 1, 0);
            this.logs.unshift("Player Heal - " + heal)
            this.monsterAttack();
        },
        playerSpecialAttack() {
            if(this.playerSpecialAttackCooldown == 0){
                const damage = getRandomNumber(10, 25);
                this.monsterHealthPoint = Math.max(this.monsterHealthPoint - damage, 0);
                this.logs.unshift("Player Special Attack - " + damage)
                this.monsterAttack();
                this.playerSpecialAttackCooldown = 2;
            }
        },
        playerSurrender(){
            this.winner = "Monster win!"
            this.logs.unshift("Player Surrender")
        },
        newGame(){
            this.monsterHealthPoint = 100,
            this.playerHealthPoint = 100,
            this.playerSpecialAttackCooldown = 0,
            this.winner = null,
            this.logs = [],
            this.rounde = 0
        },

        monsterAttack() {
            this.rounde++;
            const damage = getRandomNumber(8, 15);
            this.playerHealthPoint = Math.max(this.playerHealthPoint - damage, 0);
            this.logs.unshift("Monster attack - " + damage)
            this.logs.unshift("..................Rounde - " + this.rounde + "..................")
        },
    },
})
app.mount('#game')

function getRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min +1)) + min;
}
