package com.google.android.apps.youtube.music.ui.preference;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreEditTextPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CustomProtoDataStoreEditTextPreference extends ProtoDataStoreEditTextPreference {
    public final AppCompatEditText h;

    public CustomProtoDataStoreEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new AppCompatEditText(context, attributeSet);
    }
}
