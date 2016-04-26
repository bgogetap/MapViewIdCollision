package com.github.bgogetap.mapviewidcollision;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.gms.maps.MapView;

final class MyMapView extends FrameLayout {

    // Simulate stored id
    private static final int viewId = View.generateViewId();

    private final MapView mapView;

    MyMapView(Context context) {
        super(context);
        setId(viewId);
        mapView = new MapView(context);
        addView(mapView);
        mapView.onCreate(null);
        mapView.onResume();
    }

    @Override
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState());
    }

    @Override
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    private static final class SavedState extends BaseSavedState {

        public static final Parcelable.Creator<SavedState> CREATOR = new Creator<SavedState>() {

            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };

        private SavedState(Parcelable superState) {
            super(superState);
        }

        private SavedState(Parcel in) {
            super(in);
        }

        @Override
        public void writeToParcel(Parcel destination, int flags) {
            super.writeToParcel(destination, flags);
        }
    }
}
