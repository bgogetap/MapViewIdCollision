# MapViewIdCollision

On configuration change, this app will crash because of a ClassCastException when trying to cast AbsSavedState to the custom SavedState implementation in the MyMapView class.
This is caused by the MyMapView class' view ID conflicting with an ID in the maps.MapView hierarchy.

This can be worked around by calling View#generateViewId several times to "cycle through" the lower numbers of the AtomicInteger used to provide the ID.

Expected behavior would be for maps.MapView (or its children) to use the framework provided method for getting a unique ID, rather than seemingly using its own implementation of ID generation.
