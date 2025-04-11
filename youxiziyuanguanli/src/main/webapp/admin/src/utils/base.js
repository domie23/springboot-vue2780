const base = {
    get() {
        return {
            url : "http://localhost:8080/youxiziyuanguanli/",
            name: "youxiziyuanguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/youxiziyuanguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "游戏资源管理"
        } 
    }
}
export default base
