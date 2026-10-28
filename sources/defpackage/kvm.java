package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvm {
    public Bitmap a;
    public String b;
    public String c;
    private final Bundle d;
    private final List e;
    private String f;
    private ixt g;

    public kvm(Context context) {
        String strAc;
        ltg.a = context.getContentResolver();
        this.d = new Bundle();
        this.e = new ArrayList();
        new ApplicationErrorReport();
        try {
            if (((Boolean) kwa.a.a()).booleanValue()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jAbs = Math.abs(new SecureRandom().nextLong());
                StringBuilder sb = new StringBuilder();
                sb.append(jCurrentTimeMillis);
                sb.append('_');
                sb.append(jAbs);
                strAc = sb.toString();
            } else {
                strAc = ixt.ac();
            }
            this.f = strAc;
        } catch (SecurityException unused) {
            this.f = ixt.ac();
        }
    }

    public final kvn a() {
        kvn kvnVar = new kvn(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null, null);
        kvnVar.m = this.a;
        kvnVar.f = null;
        kvnVar.a = this.b;
        kvnVar.c = null;
        kvnVar.b = this.d;
        kvnVar.e = this.c;
        kvnVar.h = this.e;
        kvnVar.i = false;
        kvnVar.j = null;
        kvnVar.k = null;
        kvnVar.l = false;
        kvnVar.u = this.g;
        kvnVar.n = this.f;
        kvnVar.o = false;
        kvnVar.p = 0L;
        kvnVar.q = false;
        kvnVar.r = null;
        kvnVar.s = null;
        kvnVar.t = null;
        return kvnVar;
    }

    public final void b(ixt ixtVar) {
        if (this.d.isEmpty()) {
            this.e.isEmpty();
        }
        this.g = ixtVar;
    }

    @Deprecated
    public kvm() {
        this.d = new Bundle();
        this.e = new ArrayList();
        new ApplicationErrorReport();
        this.f = ixt.ac();
    }
}
