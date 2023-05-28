import axios from "axios";

export default class PublicationService {

    static async publicationApply(message, publicationId, id, token) {

        const response = await axios({
            method: 'post',
            url: "http://localhost:8080/publications/searcher/apply",
            headers: {
                Authorization: `Bearer ${token}`,
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Methods': 'POST'},
            data: {
                "message":message,
                "candidate":id,
                "publicationId": publicationId,

            }
        });
        return response;
    }

    static async isOwner(id, token) {
        const response = await axios.get(`http://localhost:8080/publications/owner/${id}`,
            {headers: {Authorization: `Bearer ${token}`}}
        );
        return response;
    }

    static async isResume(id, token) {
        const response = await axios.get(`http://localhost:8080/resume/is/${id}`,
            {headers: {Authorization: `Bearer ${token}`}}
        );
        return response;
    }

    static async getAll() {
        const response = await axios.get('http://localhost:8080/publications/searcher');
        return response;
    }

    static async createPublication(publication, id, token) {

        const response = await axios({
            method: 'post',
            url: "http://localhost:8080/publications/giver/create",
            headers: {Authorization: `Bearer ${token}`,
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Methods': 'POST'},
            data: {
                "date": Date.now().toString(),
                "title": `${publication.title}`,
                "description": publication.description,
                "requirements": publication.tags,
                "userId": id,
                "moderatorId": 0,
                "status": "Waiting",
                "views": 1
            }
        });
        return response;
    }

    static async getById(id) {
        console.log("THERE IS ID", id);
        const response = await axios.get(`http://localhost:8080/publications/searcher/${id}`)
        return response;
    }

}