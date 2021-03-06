package com.hdhelper.agent.services;

public interface RSLandscapeTile {

    RSBoundaryDecoration getBoundaryDecoration();
    RSBoundary getBoundary();
    RSEntityMarker[] getMarkers();
    RSTileDecoration getTileDecoration();
    RSItemPile getItemPile();

    int getRegionX();
    int getRegionY();
    int getFloor();

}
