package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aak {
    public Object c;
    public Object e = new ArrayList();
    public Object b = new ArrayList();
    public Object d = new Bundle();
    public Object f = new ArrayList();
    public boolean a = false;

    public aak(String str, String str2) {
        azs.l(str);
        azs.l(str2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    public final void a() {
        if (this.a) {
            this.e = new ArrayList((Collection) this.e);
            this.f = new ArrayList((Collection) this.f);
            this.b = new ArrayList((Collection) this.b);
            this.d = vm.d((Bundle) this.d);
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(tg tgVar) {
        a();
        this.e.add(tgVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final int c(CharSequence charSequence) {
        if (TextUtils.equals(this.d, charSequence)) {
            return 0;
        }
        this.d = charSequence;
        f(true);
        return 64;
    }

    public final int d(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null && bitmap2 == null && this.e == null && this.c == null) {
            return 0;
        }
        this.e = bitmap;
        this.c = bitmap2;
        return SemanticState.Hidden;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final int e(CharSequence charSequence) {
        if (TextUtils.equals(this.b, charSequence)) {
            return 0;
        }
        this.b = charSequence;
        f(true);
        return 32;
    }

    public final synchronized void f(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    public final pnq g() {
        if (this.a) {
            this.d = this.b;
        } else {
            try {
                Map mapH = h();
                Object objB = this.b;
                pno pnoVar = pno.a;
                if (mapH.containsKey(pnoVar)) {
                    List list = (List) mapH.get(pnoVar);
                    if (!list.isEmpty() && ahno.ag((CharSequence) list.get(0), "gzip")) {
                        objB = agyi.b(new GZIPInputStream(new ByteArrayInputStream((byte[]) objB)));
                    }
                }
                this.d = objB;
            } catch (IOException e) {
                this.e = e;
            }
        }
        ?? r2 = this.f;
        if (r2 == 0) {
            throw new IllegalStateException("Missing required properties: headers");
        }
        Object obj = this.c;
        Object obj2 = this.b;
        return new pnq((Integer) obj, r2, (byte[]) obj2, (byte[]) this.d, (Exception) this.e);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Map h() {
        ?? r1 = this.f;
        if (r1 != 0) {
            return r1;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final int i(abuz abuzVar) {
        Object obj = this.f;
        if (Objects.equals(obj == null ? null : ((abuz) obj).l(), abuzVar != null ? abuzVar.l() : null)) {
            return 0;
        }
        this.f = abuzVar;
        f(true);
        return SemanticState.Focused;
    }
}
