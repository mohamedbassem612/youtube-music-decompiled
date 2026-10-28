package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import defpackage.lay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {
    public final lay a;

    public AppMeasurementSdk(lay layVar) {
        this.a = layVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return lay.c(context, null).c;
    }

    public void beginAdUnitExposure(String str) {
        this.a.g(str);
    }

    public void endAdUnitExposure(String str) {
        this.a.h(str);
    }

    public long generateEventId() {
        return this.a.a();
    }

    public String getAppInstanceId() {
        return this.a.d();
    }

    public String getGmpAppId() {
        return this.a.e();
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        this.a.j(str, str2, bundle, true);
    }
}
