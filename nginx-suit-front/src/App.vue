<template>
  <div id="app">
    <img src="./assets/logo.png">
    <!-- <router-view/> -->
    <button @click="getConfig">get config</button>
    <pre>{{ config }}</pre>
  </div>
</template>

<script>
var axios = require('axios');
export default {
  name: 'App',
  data(){
    return {
      config: "init value",
    }
  },
  methods: {
    getConfig: function(){
      // this.config = "aha";
      let $component = this;
      axios.get('/nginx-suit/read').then(function (response) {
        $component.config  = response.data;
      })
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
