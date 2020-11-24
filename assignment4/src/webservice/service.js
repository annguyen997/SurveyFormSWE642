const express = require('express');
const oracledb = require('oracledb');
const dbConfig = require('./dbconfig.js');
const studentRepo = require('./studentrepo.js');

const app = express();

app.get('/studentInfo', async (req, res) => {
    var rows = await studentRepo.getStudentInfo(req.query.id);
    res.send(rows);
});

app.post('/studentInfo', async (req, res) => {
    var rows = await studentRepo.getStudentInfo(req.query.id);
    res.send(rows);
});

const PORT = process.env.PORT || 8082;
app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}...`);
});