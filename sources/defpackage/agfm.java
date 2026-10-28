package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agfm {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public agfm() {
        this.c = "YouTube";
        this.d = "LithoView:0-height";
        this.b = 0;
        this.a = false;
    }

    public static agfm b(char c) {
        return new agfm(new agff(new agdn(c)));
    }

    public static agfm c(String str) {
        return str.length() == 1 ? new agfm(new agff(new agdn(str.charAt(0)))) : new agfm(new agfg(str, 1));
    }

    public static agfm d(String str) {
        agen agenVar = new agen(Pattern.compile(str));
        ahno.K(!((Matcher) agenVar.a("").a).matches(), "The pattern may not match the empty string: %s", agenVar);
        return new agfm(new agfg(agenVar, 0));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [agfl, java.lang.Object] */
    public final agfm a() {
        return new agfm(this.d, true, (agdw) this.c, this.b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [agfl, java.lang.Object] */
    public final agfm e() {
        agdw agdwVar = agdv.b;
        agdwVar.getClass();
        return new agfm(this.d, this.a, agdwVar, this.b);
    }

    public final Iterable f(CharSequence charSequence) {
        charSequence.getClass();
        return new agfk(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [agfl, java.lang.Object] */
    public final Iterator g(CharSequence charSequence) {
        return this.d.a(this, charSequence);
    }

    public final List h(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public agfm(agfl agflVar, boolean z, agdw agdwVar, int i) {
        this.d = agflVar;
        this.a = z;
        this.c = agdwVar;
        this.b = i;
    }

    public agfm(String str, boolean z) {
        this.c = "com.google.android.gms";
        this.d = str;
        this.b = 4225;
        this.a = z;
    }

    public agfm(agfl agflVar) {
        this(agflVar, false, agdt.a, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
