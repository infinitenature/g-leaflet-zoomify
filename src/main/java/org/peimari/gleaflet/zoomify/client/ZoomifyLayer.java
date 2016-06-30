package org.peimari.gleaflet.zoomify.client;

import org.peimari.gleaflet.client.TileLayer;

public class ZoomifyLayer extends TileLayer {

	protected ZoomifyLayer() {
	}

	public static final native ZoomifyLayer create(String url, ZoomifyLayerOptions options)
	/*-{
		return new $wnd.L.TileLayer.Zoomify(url, options);
	}-*/;

}
