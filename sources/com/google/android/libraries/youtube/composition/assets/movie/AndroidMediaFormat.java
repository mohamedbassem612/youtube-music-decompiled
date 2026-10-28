package com.google.android.libraries.youtube.composition.assets.movie;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidMediaFormat {
    final ArrayList bytesValues;
    final ArrayList floatValues;
    final ArrayList int64Values;
    final ArrayList intValues;
    final ArrayList stringValues;

    public AndroidMediaFormat(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.intValues = arrayList;
        this.int64Values = arrayList2;
        this.floatValues = arrayList3;
        this.stringValues = arrayList4;
        this.bytesValues = arrayList5;
    }

    public ArrayList getBytesValues() {
        return this.bytesValues;
    }

    public ArrayList getFloatValues() {
        return this.floatValues;
    }

    public ArrayList getInt64Values() {
        return this.int64Values;
    }

    public ArrayList getIntValues() {
        return this.intValues;
    }

    public ArrayList getStringValues() {
        return this.stringValues;
    }

    public String toString() {
        ArrayList arrayList = this.bytesValues;
        ArrayList arrayList2 = this.stringValues;
        ArrayList arrayList3 = this.floatValues;
        ArrayList arrayList4 = this.int64Values;
        return "AndroidMediaFormat{intValues=" + String.valueOf(this.intValues) + ",int64Values=" + String.valueOf(arrayList4) + ",floatValues=" + String.valueOf(arrayList3) + ",stringValues=" + String.valueOf(arrayList2) + ",bytesValues=" + String.valueOf(arrayList) + '}';
    }
}
