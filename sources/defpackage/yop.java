package defpackage;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yop implements yoe {
    public final yoc a;
    public final wiu b;
    public final axo c;
    public final List d;
    public final List e;
    public final SelectableFormatsOuterClass$SelectableFormats f;
    public final wiw[] g;
    public final wgo[] h;
    public final ArrayList i;
    public final ArrayList j;
    public final MediaCapabilitiesOuterClass$MediaCapabilities k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    private final boolean q;
    private final float r;

    private yop(yoc yocVar, wiu wiuVar, axo axoVar, List list, List list2, SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats, wiw[] wiwVarArr, wgo[] wgoVarArr, boolean z, ArrayList arrayList, ArrayList arrayList2, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities, float f, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = yocVar;
        this.b = wiuVar;
        this.c = axoVar;
        this.d = list;
        this.e = list2;
        this.f = selectableFormatsOuterClass$SelectableFormats;
        this.g = wiwVarArr;
        this.h = wgoVarArr;
        this.q = z;
        this.i = arrayList;
        this.j = arrayList2;
        this.k = mediaCapabilitiesOuterClass$MediaCapabilities;
        this.r = f;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 yop, still in use, count: 4, list:
          (r1v3 yop) from 0x0391: MOVE (r29v2 yop) = (r1v3 yop)
          (r1v3 yop) from 0x0495: MOVE (r29v3 yop) = (r1v3 yop)
          (r1v3 yop) from 0x044e: PHI (r1v31 yop) = (r1v3 yop), (r1v33 yop) binds: [B:171:0x03d0, B:285:0x044e] A[DONT_GENERATE, DONT_INLINE]
          (r1v3 yop) from 0x03df: PHI (r1v33 yop) = (r1v3 yop), (r1v37 yop) binds: [B:175:0x03db, B:194:0x0449] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static defpackage.yop n(defpackage.yoc r21, defpackage.wiu r22, defpackage.axo r23, java.util.List r24, java.util.List r25, com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats r26, com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yop.n(yoc, wiu, axo, java.util.List, java.util.List, com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats, com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities, boolean, boolean, boolean, boolean, boolean, boolean, boolean):yop");
    }

    private static List p(List list, Predicate predicate) {
        return (List) Collection.EL.stream(list).filter(predicate).collect(Collectors.toCollection(new ieu(20)));
    }

    @Override // defpackage.yoe
    public final float a() {
        if (this.l) {
            return this.r;
        }
        return 0.0f;
    }

    @Override // defpackage.yoe
    public final yog b() {
        return this.a.h;
    }

    @Override // defpackage.yoe
    public final yog c() {
        return this.a.g;
    }

    @Override // defpackage.yoe
    public final String d() {
        return this.a.j;
    }

    @Override // defpackage.yoe
    public final String e() {
        return this.a.b();
    }

    @Override // defpackage.yoe
    public final ArrayList f() {
        return this.i;
    }

    @Override // defpackage.yoe
    public final ArrayList g() {
        return this.j;
    }

    @Override // defpackage.yoe
    public final boolean h() {
        return this.a.c(64);
    }

    @Override // defpackage.yoe
    public final boolean i() {
        return true;
    }

    @Override // defpackage.yoe
    public final boolean j() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (wir.z().contains(Integer.valueOf(((wgs) it.next()).e()))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yoe
    public final boolean k() {
        return this.q;
    }

    @Override // defpackage.yoe
    public final boolean l() {
        return false;
    }

    @Override // defpackage.yoe
    public final wgo[] m() {
        return this.h;
    }

    @Override // defpackage.yoe
    public final wiw[] o() {
        return this.g;
    }
}
