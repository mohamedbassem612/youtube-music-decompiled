package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aero {
    public static aero c;
    public final int a;
    public final Object b;

    public aero(List list) {
        if (list.isEmpty()) {
            this.a = 0;
            this.b = null;
        } else {
            this.a = ((Integer) list.get(0)).intValue();
            this.b = list.size() > 3 ? new aerm(((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue(), list.subList(3, list.size())) : null;
        }
    }

    public aero(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public aero(Context context, byte[] bArr) {
        this.b = context;
        this.a = 2;
    }

    public aero(Object obj) {
        this.a = 2;
        this.b = obj;
    }

    public aero(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public aero(Object obj, byte[] bArr) {
        this.a = 4;
        this.b = obj;
    }

    public aero(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public aero() {
        this.a = 1;
        this.b = new ArrayList();
    }

    public aero(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public aero(Context context) {
        this.b = context.getMainLooper().getThread();
        this.a = txz.a(context);
    }
}
