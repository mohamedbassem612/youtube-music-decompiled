package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zxi {
    public final String a;
    public Uri b;
    public byte[] c;
    public boolean d;
    public long e;
    public Map f;
    public zwa g;
    public String h;
    public Optional i;
    public final zxh j;
    public zya k;
    public final int l;

    public zxi(byte[] bArr) {
        this.c = null;
        this.d = false;
        this.i = Optional.empty();
        this.j = zxh.a;
        this.k = zya.a;
        this.l = 2;
        this.c = bArr;
        this.a = "qoe";
    }

    public final void a(tok tokVar) {
        this.i = Optional.of(tokVar);
    }

    public final void b(Uri uri) {
        uri.getClass();
        this.b = uri;
    }

    public zxi(int i, String str) {
        this.c = null;
        this.d = false;
        this.i = Optional.empty();
        this.j = zxh.a;
        this.k = zya.a;
        this.l = i;
        this.a = str;
    }
}
