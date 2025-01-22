import Sequelize from "sequelize";
const { DataTypes, Op } = Sequelize;

const sequelize = new Sequelize({
	dialect: "sqlite",
	storage: "./database.sqlite",
	define: {
		timestamps: false,
	},
});  

const Student = sequelize.define('students', {
    student_id: {
        type: DataTypes.INTEGER,
        primaryKey: true,
        autoIncrement: true
    },
    name: {
        type: DataTypes.STRING,
        allowNull: false,
        validate: {
            min: 4,
            max: 20,
        }
    },
    favorite_class: {
        type: DataTypes.STRING,
        defaultValue: "Computer Science"
    },
    school_year: {
        type: DataTypes.INTEGER,
        allowNull: false
    },
    has_language_examination: {
        type: DataTypes.BOOLEAN,
        defaultValue: true
    }
});

sequelize.sync({force: true})
.then(() => {
    return Student.bulkCreate([
        {
            name: 'Peter Parker',
            school_year: 3,
            favorite_class: 'Biologi',
            has_language_examination: false,
        },
        {
            name: 'Clark Kent',
            school_year: 5,
        },
        {
            name: 'Orion Pax',
            school_year: 3,
        },
        {
            name: 'Aya Neverbook',
            school_year: 4,
            has_language_examination: false,
        },
        {
            name: 'Den Epick',
            school_year: 80,
            favorite_class: 'Filozofi',
        },
    ]);
})
/*.then(Student.findAll())

.then(Student.findAll({
    where: {
      [Op.or]: { favorite_class: "Computer Science", has_language_examination: true },
    },
}));*/