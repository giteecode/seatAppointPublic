const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot7ss9a/",
            name: "springboot7ss9a",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot7ss9a/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校图书馆座位预约系统"
        }
    }
}
export default base
