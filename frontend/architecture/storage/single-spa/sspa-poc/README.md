## Container

Add serve to package.json

```sh
mkdir container
cd container
npm install --save serve
```
Add a start scripts to [package.json]

```sh

{
  "scripts": {
    "start": "serve -s -l 4200"
  }
}
```
Add an [index.html] to container folder to configure the routing.

![image info](https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/route.png)

## Navbar
```sh
create-single-spa
```
![image info](https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/create.png)


Add routing to primary-nav.component.html


![image info](https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/nav.png)
 
## App1
```sh
create-single-spa
```
![image info](https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/create.png)


## App2

```sh
create-single-spa
```

![image info](https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/create.png)



[package.json]: <https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/container/package.json>
[index.html]: <https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/container/index.html>