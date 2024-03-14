const {Worker, isMainThread, parentPort} = require("worker_threads");


// Allocate memory for 4 integers

const sab = new SharedArrayBuffer(Int32Array.BYTES_PER_ELEMENT * 4);

const arr = new Int32Array(sab);


if (isMainThread) {

    const worker = new Worker(__filename, {workerData: arr});

    worker.on("message", msg => {

   	 if (msg.type === "update") {

   		 console.log(arr);

   	 }

    });

    worker.postMessage({type: "init", arr});

}

else {

    parentPort.on("message", msg => {

   	 if (msg.type === "init") {

   		 msg.arr[0] = 1001;

   		 parentPort.postMessage({type: "update"});

   	 }

    });

}
