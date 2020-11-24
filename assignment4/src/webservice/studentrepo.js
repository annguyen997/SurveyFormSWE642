const oracledb = require('oracledb');
const dbConfig = require('./dbconfig.js');

var connection;

const getStudentInfo = async (id) => {
    if(!connection) {
        connection = await oracledb.getConnection(dbConfig);
    }
    try {
        var stmt = `select * from studentInfo where studentid='${id}'`
        var rows = await connection.execute(stmt);
    } catch(e) {
        console.error(e);
    }
    return rows.rows[0]
}

exports.getStudentInfo = getStudentInfo;