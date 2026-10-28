package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aamh {
    public final String a;
    public final String b;
    public final Uri c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Date g;
    public final aofu h;
    public final String i;
    public final alja j;
    public final abuz k;
    public final aaok l;

    public aamh(String str, String str2, aaok aaokVar, Uri uri, abuz abuzVar, int i, boolean z, boolean z2, Date date, alay alayVar, aofu aofuVar) {
        if (aofuVar != null && (aofuVar.b & SemanticState.Multiline) != 0 && aofuVar.n == null) {
            alay alayVar2 = alay.a;
        }
        str.getClass();
        this.a = str;
        this.b = str2;
        this.l = aaokVar;
        this.c = uri;
        this.k = abuzVar;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = date;
        this.h = aofuVar;
        this.i = null;
        this.j = null;
        if (alayVar != null || aofuVar == null || (aofuVar.b & SemanticState.ReadOnly) == 0 || aofuVar.l != null) {
            return;
        }
        alay alayVar3 = alay.a;
    }

    public static aamh a(aofu aofuVar) {
        int size;
        if (aofuVar.f.size() != 0) {
            size = aofuVar.f.size();
            aihf builder = aofuVar.toBuilder();
            builder.copyOnWrite();
            ((aofu) builder.instance).f = aofu.emptyProtobufList();
            aofuVar = (aofu) builder.build();
        } else {
            size = 0;
        }
        aqmh aqmhVar = aofuVar.d;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        abuz abuzVar = new abuz(aajg.f(aqmhVar, agke.q(480)));
        aodw aodwVar = aofuVar.e;
        if (aodwVar == null) {
            aodwVar = aodw.a;
        }
        return c(aofuVar, false, size, abuzVar, aaok.b(aodwVar));
    }

    public static aamh b(String str, int i, String str2) {
        return new aamh(str, str2, null, null, new abuz(aqmh.a), i, false, false, new Date(Long.MAX_VALUE), null, null);
    }

    public static aamh c(aofu aofuVar, boolean z, int i, abuz abuzVar, aaok aaokVar) {
        String str = aofuVar.c;
        String str2 = aofuVar.g;
        alay alayVar = null;
        Uri uri = aofuVar.h.isEmpty() ? null : Uri.parse(aofuVar.h);
        long j = aofuVar.m;
        boolean z2 = aofuVar.k;
        Date date = new Date(TimeUnit.SECONDS.toMillis(aofuVar.i));
        if ((aofuVar.b & SemanticState.ReadOnly) != 0 && (alayVar = aofuVar.l) == null) {
            alayVar = alay.a;
        }
        return new aamh(str, str2, aaokVar, uri, abuzVar, i, z, z2, date, alayVar, aofuVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aamh(aamh aamhVar, int i) {
        String str = aamhVar.a;
        String str2 = aamhVar.b;
        aaok aaokVar = aamhVar.l;
        Uri uri = aamhVar.c;
        abuz abuzVar = aamhVar.k;
        boolean z = aamhVar.e;
        boolean z2 = aamhVar.f;
        Date date = aamhVar.g;
        aofu aofuVar = aamhVar.h;
        String str3 = aamhVar.i;
        alja aljaVar = aamhVar.j;
        this(str, str2, aaokVar, uri, abuzVar, i, z, z2, date, aofuVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aamh(String str, String str2, aaok aaokVar, Uri uri, abuz abuzVar, int i, boolean z, boolean z2, Date date, aofu aofuVar) {
        alay alayVar = null;
        if (aofuVar != null && (aofuVar.b & SemanticState.ReadOnly) != 0 && (alayVar = aofuVar.l) == null) {
            alayVar = alay.a;
        }
        this(str, str2, aaokVar, uri, abuzVar, i, z, z2, date, alayVar, aofuVar);
    }
}
