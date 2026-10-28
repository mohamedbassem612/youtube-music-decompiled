package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class byk implements bye {
    private final Context a;
    private final List b = new ArrayList();
    private final bye c;
    private bye d;
    private bye e;
    private bye f;
    private bye g;
    private bye h;
    private bye i;
    private bye j;
    private bye k;

    public byk(Context context, bye byeVar) {
        this.a = context.getApplicationContext();
        this.c = byeVar;
    }

    private final bye g() {
        if (this.e == null) {
            bxv bxvVar = new bxv(this.a);
            this.e = bxvVar;
            h(bxvVar);
        }
        return this.e;
    }

    private final void h(bye byeVar) {
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                return;
            }
            byeVar.e((bzg) list.get(i));
            i++;
        }
    }

    private static final void i(bye byeVar, bzg bzgVar) {
        if (byeVar != null) {
            byeVar.e(bzgVar);
        }
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        bye byeVar = this.k;
        byeVar.getClass();
        return byeVar.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        bye byeVarG;
        ahno.O(this.k == null);
        Uri uri = byiVar.a;
        String scheme = uri.getScheme();
        int i = bwp.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    byq byqVar = new byq();
                    this.d = byqVar;
                    h(byqVar);
                }
                byeVarG = this.d;
                this.k = byeVarG;
            } else {
                byeVarG = g();
                this.k = byeVarG;
            }
        } else if ("asset".equals(scheme)) {
            byeVarG = g();
            this.k = byeVarG;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                bxz bxzVar = new bxz(this.a);
                this.f = bxzVar;
                h(bxzVar);
            }
            byeVarG = this.f;
            this.k = byeVarG;
        } else if ("rtmp".equals(scheme)) {
            byeVarG = this.g;
            if (byeVarG == null) {
                try {
                    bye byeVar = (bye) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.g = byeVar;
                    h(byeVar);
                } catch (ClassNotFoundException unused) {
                    bvx.e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                byeVarG = this.g;
                if (byeVarG == null) {
                    byeVarG = this.c;
                    this.g = byeVarG;
                }
            }
            this.k = byeVarG;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                bzi bziVar = new bzi();
                this.h = bziVar;
                h(bziVar);
            }
            byeVarG = this.h;
            this.k = byeVarG;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                bya byaVar = new bya();
                this.i = byaVar;
                h(byaVar);
            }
            byeVarG = this.i;
            this.k = byeVarG;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    bzb bzbVar = new bzb(this.a);
                    this.j = bzbVar;
                    h(bzbVar);
                }
                byeVarG = this.j;
            } else {
                byeVarG = this.c;
            }
            this.k = byeVarG;
        }
        return byeVarG.b(byiVar);
    }

    @Override // defpackage.bye
    public final Uri c() {
        bye byeVar = this.k;
        if (byeVar == null) {
            return null;
        }
        return byeVar.c();
    }

    @Override // defpackage.bye
    public final Map d() {
        bye byeVar = this.k;
        return byeVar == null ? Collections.EMPTY_MAP : byeVar.d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        bzgVar.getClass();
        this.c.e(bzgVar);
        this.b.add(bzgVar);
        i(this.d, bzgVar);
        i(this.e, bzgVar);
        i(this.f, bzgVar);
        i(this.g, bzgVar);
        i(this.h, bzgVar);
        i(this.i, bzgVar);
        i(this.j, bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        bye byeVar = this.k;
        if (byeVar != null) {
            try {
                byeVar.f();
            } finally {
                this.k = null;
            }
        }
    }
}
