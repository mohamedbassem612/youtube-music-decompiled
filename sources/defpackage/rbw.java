package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rbw implements bye {
    bye a;
    bye b;
    private final jsk c;
    private final bye d;
    private final List e = new ArrayList();
    private final Key f;
    private final qua g;
    private jsn h;

    public rbw(jsk jskVar, Key key, bye byeVar, qua quaVar) {
        this.c = jskVar;
        this.f = key;
        this.d = byeVar;
        this.g = quaVar;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        bye byeVar = this.a;
        byeVar.getClass();
        return byeVar.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        if (URLUtil.isNetworkUrl(byiVar.a.toString()) && this.g.ac) {
            if (this.h == null) {
                Key key = this.f;
                byte[] encoded = key != null ? key.getEncoded() : null;
                this.b = encoded == null ? new jsx("Online") : new bxs(encoded, new jsx("Online"));
                jsn jsnVar = new jsn(this.c, this.d, this.b, null, 0, null);
                this.h = jsnVar;
                int i = 0;
                while (true) {
                    List list = this.e;
                    if (i >= list.size()) {
                        break;
                    }
                    jsnVar.e((bzg) list.get(i));
                    i++;
                }
            }
            this.a = this.h;
        } else {
            this.a = this.d;
        }
        bye byeVar = this.a;
        byeVar.getClass();
        return byeVar.b(byiVar);
    }

    @Override // defpackage.bye
    public final Uri c() {
        bye byeVar = this.a;
        if (byeVar == null) {
            return null;
        }
        return byeVar.c();
    }

    @Override // defpackage.bye
    public final /* synthetic */ Map d() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        this.d.e(bzgVar);
        this.e.add(bzgVar);
        jsn jsnVar = this.h;
        if (jsnVar != null) {
            jsnVar.e(bzgVar);
        }
    }

    @Override // defpackage.bye
    public final void f() {
        bye byeVar = this.a;
        if (byeVar != null) {
            try {
                byeVar.f();
            } finally {
                this.a = null;
            }
        }
    }
}
