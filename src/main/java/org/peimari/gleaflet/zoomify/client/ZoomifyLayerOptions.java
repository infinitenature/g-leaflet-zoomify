package org.peimari.gleaflet.zoomify.client;

import org.peimari.gleaflet.client.TileLayerOptions;

public class ZoomifyLayerOptions extends TileLayerOptions {
	protected ZoomifyLayerOptions() {
	}

	public static native ZoomifyLayerOptions create()
	/*-{
		return {};
	}-*/;

	public native final void setWidth(int width)
	/*-{
		this.width = width;
	}-*/;

	public native final void setHeight(int height)
	/*-{
		this.height = height;
	}-*/;
}
