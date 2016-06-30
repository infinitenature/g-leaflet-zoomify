package org.peimari.gleaflet.zoomify.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletZoomifiyClientBundle extends ClientBundle {
 
    @Source("L.TileLayer.Zoomify.js")
    @DoNotEmbed
    TextResource zoomifyScript();

}
