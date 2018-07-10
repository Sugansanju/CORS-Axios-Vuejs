<template>
<div>
    <div><input type="text" class="form-control" v-model="user.email" placeholder="Username"></div>
    <div><input type="password" class="form-control" v-model="user.password" placeholder="Password"></div>
    <a class="btn pointer" @click="login(user)">Login</a>
</div>
</template>

<script>
export default {
    name: 'Login',
    data: function () {
        return {
          user:{
            email : "",
            password : ""
          },
      }
    },
    methods: {
        login(user) {
            axios({
                method: 'post',
                url:'/customer/login',
                //   method:'get',
                //  url: '/customer/list',
                headers: {
                  'Content-Type': 'application/json'
                },
                data: {
                    'email': user.email,
                    'password': user.password
                }
            }).then((result) => {
                console.log(result);
            }).catch((err) => {
                console.log(err);
            });

        }
    }
};
</script>

<style>
.pointer {
    cursor: pointer;
}
</style>
