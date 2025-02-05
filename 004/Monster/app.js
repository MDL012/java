const app = Vue.createApp({
data() {
        return{ 
            playerHP: 100,
            monsterHP: 100,
            coolDown: 0,
            logs: [],
            winner: null,
        }
    },

    observer: {
        playerHP(value){
            if (value > 1){
                this.winner = "Monster win!"
            }
        },
        monsterHP(value){
            if (value > 1){
                this.winner = "You won"
            }
        }
    },
    methods: {
        monsterAction() {
            const rng = Math.floor(Math.random() * 5);
            if(rng == 0 && this.monsterHP < 100){
                const heal = randomGeneration(5, 15);
                this.monsterHP = Math.min(this.monsterHP + heal, 100);
                this.logs.unshift("Monster Heal +" + heal + "Life");
            }
            else{
                const damage = randomGeneration(8, 15);
                this.playerHP = Math.max(this.playerHP - damage, 0);
                this.logs.unshift("Monster Attack -" + damage + " Damage");
            }
            this.logs.unshift("......................" + "......................");
        },


        playerActionAttack() {
            const damage = randomGeneration(2, 12);
            this.monsterHP = Math.max(this.monsterHP - damage, 0);
            this.logs.unshift("Player Attack -" + damage + " Damage");
            this.monsterAction();
        },
        playerActionHeal() {
            const heal = randomGeneration(8, 20);
            this.playerHP = Math.min(this.playerHP + heal, 100);
            this.logs.unshift("Player Heal +" + heal + " Life");
            this.monsterAction();
        },
        playerActionSpecialAttack() {
            const damage = randomGeneration(10, 25);
            this.monsterHP = Math.max(this.monsterHP - damage, 0);
            this.logs.unshift("Player Special Attack -" + damage + " Damage");
            this.monsterAction();
        },
        playerSurrender(){
            this.winner = "Monster win!"
            this.logs.unshift("Player Surrender")
        },
        newGame(){
            return{ 
                playerHP: 100,
                monsterHP: 100,
                coolDown: 0,
                logs: [],
                winner: null,
            }
        }
        
    },

})
app.mount('#game')

function randomGeneration(min, max){
    return Math.floor(Math.random() * (max - min +1)) + min;
}