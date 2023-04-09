require(["esri/config", "esri/Map", "esri/views/SceneView", "esri/widgets/BasemapToggle",
    "esri/widgets/BasemapGallery"], function(esriConfig, Map, SceneView) {

    esriConfig.apiKey = "AAPK2a183da2bc29419b8db500c00821afd38xm1wb-uOZVDpxd16RFejr-2-ZKnsU1Rk1jp-MyHH-3qb_w8vsfF6njvZXuOCRZU";

    const map = new Map({
        basemap: "arcgis-topographic", //Basemap layer service
        ground: "world-elevation", //Elevation service
    });

    const view = new SceneView({
        container: "viewDiv",
        map: map,
        camera: {
            position: {
                x: -118.808, //Longitude
                y: 33.961, //Latitude
                z: 2000 //Meters
            },
            tilt: 75
        }
    });


});


