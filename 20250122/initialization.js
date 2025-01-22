import Sequelize from "sequelize";
const { DataTypes, Op } = Sequelize;

const sequelize = new Sequelize('student_id', 'name', 'favorite_class', 'school_year', 'has_language_examination', { 
    host: 'localhost', 
    dialect: 'mysql', // vagy 'postgres', 'sqlite', stb.
    //  logging: false,
  });  

const Student = sequelize.define('students', {
    student_id: {
        type: DataTypes.INTEGER,
        primaryKey,
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
        type: DataTypes.STRING(25),
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

sequelize.sync().then(() => {
    return Student.bulkCreate()({
        name: 'Den Epick',
        school_year: 80,
        favorite_class: 'Filozofi',
    });
});

sequelize.sync().then(() => {
    return Student.bulkCreate()({
        name: 'Aya Neverbook',
        school_year: 4,
        has_language_examination: false,
    });
});

sequelize.sync().then(() => {
    return Student.bulkCreate()({
        name: 'Orion Pax',
        school_year: 3,
    });
});

sequelize.sync().then(() => {
    return Student.bulkCreate()({
        name: 'Peter Parker',
        school_year: 3,
        favorite_class: 'Biologi',
        has_language_examination: false,
    });
});

sequelize.sync().then(() => {
    return Student.bulkCreate()({
        name: 'Clark Kent',
        school_year: 5,
    });
});

Student.findAll();

Student.findAll({
    where: {
      [Op.or]: { favorite_class: "Computer Science", has_language_examination: true },
    },
});