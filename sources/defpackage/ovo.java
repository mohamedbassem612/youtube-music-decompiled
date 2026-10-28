package defpackage;

import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.io.EOFException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ovo {
    public final Object a;
    public Object b;
    public Object c;

    public ovo(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.c = fArr3;
        this.b = new float[2];
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, this.b, 0, 2);
        this.a = new Matrix();
    }

    private static UpbMessage u(long j, long j2, UpbMiniTable upbMiniTable) {
        UpbArena upbArenaB = UpbArena.b(j2);
        if (upbArenaB != null) {
            return new UpbMessage(j, upbMiniTable, upbArenaB);
        }
        throw new IllegalStateException("Failed to wrap arena");
    }

    private static oon v(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        byte bPeekByte = Memory.peekByte(FlagServices.b().c + 103);
        for (int i = 0; i < jArr.length; i++) {
            arrayList.add(new atgg(bPeekByte != 0 ? u(jArr[i], jArr2[i], atgf.a) : new UpbMessage(jArr[i], atgf.a, UpbArena.a(jArr2[i]))));
        }
        return new ovn(arrayList);
    }

    private final Size w(int i, long j, long j2, long[] jArr, long[] jArr2, int i2, int i3, boolean z, long j3, int i4, abk abkVar) {
        Object objA;
        oph ophVar;
        ElementsServices elementsServices = (ElementsServices) this.a;
        opm opmVarI = elementsServices.I(i);
        if (opmVarI == null) {
            return new Size(0, 0);
        }
        mew mewVar = new mew(u(j, j2, atoe.a), (byte[][]) null);
        if ((opmVarI.a() & 32) <= 0) {
            return opmVarI.j(mewVar.d(opmVarI.b()), elementsServices, i2, i3, z, abkVar);
        }
        Object obj = this.c;
        if (obj != null) {
            agp agpVar = ((ElementsRuntimeImpl) obj).h;
            synchronized (agpVar) {
                aga agaVar = (aga) agpVar.a(j3);
                if (agaVar != null) {
                    objA = agaVar.a(i4);
                } else {
                    objA = null;
                }
            }
        } else {
            objA = null;
        }
        agp agpVar2 = ((ElementsRuntimeImpl) elementsServices.L().io()).e;
        synchronized (agpVar2) {
            NodeTreeProcessorImpl nodeTreeProcessorImpl = (NodeTreeProcessorImpl) agpVar2.a(j3);
            ophVar = nodeTreeProcessorImpl != null ? nodeTreeProcessorImpl.b : null;
        }
        return opmVarI.k(mewVar.d(opmVarI.b()), elementsServices, i2, i3, z, abkVar, v(jArr, jArr2), objA, ophVar);
    }

    private static final void x(wns wnsVar, List list) {
        for (aire aireVar : wnsVar.c()) {
            if ((aireVar.b & 1) != 0) {
                aobx aobxVar = aireVar.c;
                if (aobxVar == null) {
                    aobxVar = aobx.a;
                }
                list.add(aobxVar.e);
            }
        }
    }

    public final long a() {
        Object obj = this.b;
        if (obj != null) {
            return ((cvb) obj).b;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Type inference failed for: r7v4, types: [cvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [cvl, java.lang.Object] */
    public final void b(brv brvVar, Uri uri, Map map, long j, long j2, cvk cvkVar) throws coz {
        cvb cvbVar = new cvb(brvVar, j, j2);
        this.b = cvbVar;
        if (this.c == null) {
            cvi[] cviVarArrA = this.a.a(uri, map);
            int length = cviVarArrA.length;
            agjz agjzVarF = agke.f(length);
            if (length == 1) {
                this.c = cviVarArrA[0];
            } else {
                for (int i = 0; i < length; i++) {
                    cvi cviVar = cviVarArrA[i];
                    try {
                        if (cviVar.e(cvbVar)) {
                            this.c = cviVar;
                            ahno.O(cviVar != null || cvbVar.b == j);
                            cvbVar.k();
                            break;
                        } else {
                            agjzVarF.j(cviVar.a());
                            boolean z = this.c != null || cvbVar.b == j;
                            ahno.O(z);
                            cvbVar.k();
                        }
                    } catch (EOFException unused) {
                        if (this.c != null || cvbVar.b == j) {
                        }
                    } catch (Throwable th) {
                        ahno.O(this.c != null || cvbVar.b == j);
                        cvbVar.k();
                        throw th;
                    }
                    ahno.O(z);
                    cvbVar.k();
                }
                if (this.c == null) {
                    throw new coz("None of the available extractors (" + new ager(", ").b(aguu.u(agke.p(cviVarArrA), new cbs(3))) + ") could read the stream.", agjzVarF.g());
                }
            }
            this.c.b(cvkVar);
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [cjz, java.lang.Object] */
    public final cjz c(bss bssVar) {
        ?? r13;
        bsp bspVar = bssVar.c;
        bspVar.getClass();
        bsm bsmVar = bspVar.c;
        if (bsmVar == null) {
            return cjz.m;
        }
        synchronized (this.a) {
            if (!Objects.equals(bsmVar, this.c)) {
                this.c = bsmVar;
                byl bylVar = new byl();
                bylVar.b = null;
                ckj ckjVar = new ckj(bylVar);
                agqr it = bsmVar.c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    str.getClass();
                    str2.getClass();
                    Map map = ckjVar.b;
                    synchronized (map) {
                        try {
                            map.put(str, str2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                HashMap map2 = new HashMap();
                UUID uuid = brt.a;
                crh crhVar = new crh();
                UUID uuid2 = bsmVar.a;
                int[] iArrS = ahng.S(bsmVar.g);
                for (int i : iArrS) {
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    ahno.F(z);
                }
                cjs cjsVar = new cjs(uuid2, ckjVar, map2, (int[]) iArrS.clone(), crhVar);
                byte[] bArr = bsmVar.h;
                byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                ahno.O(cjsVar.b.isEmpty());
                cjsVar.j = bArrCopyOf;
                this.b = cjsVar;
            }
            r13 = this.b;
            r13.getClass();
        }
        return r13;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final aizq d() {
        ajvu ajvuVarC = ((vxu) this.a.io()).c();
        if ((ajvuVarC.b & 32) == 0) {
            return null;
        }
        aizq aizqVar = ajvuVarC.g;
        return aizqVar == null ? aizq.b : aizqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.text.CharacterIterator] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v1 */
    public final BreakIterator e(CharSequence charSequence) {
        Object wordInstance = this.b;
        if (wordInstance == null) {
            wordInstance = BreakIterator.getWordInstance();
            this.b = wordInstance;
        }
        Object obj = this.c;
        ?? r1 = obj;
        if (obj == null) {
            owh owhVar = new owh();
            this.c = owhVar;
            r1 = owhVar;
        }
        owh owhVar2 = (owh) r1;
        owhVar2.a = charSequence;
        owhVar2.b = charSequence.length();
        owhVar2.c = 0;
        ?? r0 = (BreakIterator) wordInstance;
        r0.setText(r1);
        return r0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[LOOP:1: B:28:0x0077->B:31:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0087 A[EDGE_INSN: B:38:0x0087->B:32:0x0087 BREAK  A[LOOP:1: B:28:0x0077->B:31:0x0085], SYNTHETIC] */
    public final int[] f(CharSequence charSequence, int i) {
        int iPreceding;
        int iFollowing;
        int iFollowing2;
        int i2;
        if (TextUtils.isEmpty(charSequence)) {
            int[] iArr = (int[]) this.a;
            iArr[0] = 0;
            iArr[1] = 0;
            return iArr;
        }
        int length = charSequence.length();
        int iMax = Math.max(0, Math.min(i, length));
        BreakIterator breakIteratorE = e(charSequence);
        if (breakIteratorE.isBoundary(iMax)) {
            if (iMax < length && Character.isLetterOrDigit(charSequence.charAt(iMax))) {
                iFollowing2 = breakIteratorE.following(iMax);
            } else if (iMax <= 0 || !Character.isLetterOrDigit(charSequence.charAt(iMax - 1))) {
                iPreceding = breakIteratorE.preceding(iMax);
                iFollowing = breakIteratorE.following(iMax);
            } else {
                int iPreceding2 = breakIteratorE.preceding(iMax);
                iFollowing2 = iMax;
                iMax = iPreceding2;
            }
            if (iMax == -1) {
                iMax = 0;
            }
            if (iFollowing2 != -1) {
                length = iFollowing2;
            }
            while (iMax < length && !Character.isLetterOrDigit(charSequence.charAt(iMax))) {
                iMax++;
            }
            while (length > iMax) {
                i2 = length - 1;
                if (!Character.isLetterOrDigit(charSequence.charAt(i2))) {
                    break;
                }
                length = i2;
            }
            int[] iArr2 = (int[]) this.a;
            iArr2[0] = iMax;
            iArr2[1] = length;
            return iArr2;
        }
        iPreceding = breakIteratorE.preceding(iMax);
        iFollowing = breakIteratorE.following(iMax);
        iFollowing2 = iFollowing;
        iMax = iPreceding;
        if (iMax == -1) {
            iMax = 0;
        }
        if (iFollowing2 != -1) {
            length = iFollowing2;
        }
        while (iMax < length) {
            iMax++;
        }
        while (length > iMax) {
            i2 = length - 1;
            if (!Character.isLetterOrDigit(charSequence.charAt(i2))) {
                break;
                break;
            }
            length = i2;
        }
        int[] iArr3 = (int[]) this.a;
        iArr3[0] = iMax;
        iArr3[1] = length;
        return iArr3;
    }

    public final wns g() {
        apjh apjhVar;
        alkz alkzVar = (alkz) this.a;
        wns wnsVar = null;
        if ((alkzVar.b & 64) != 0) {
            apjhVar = alkzVar.f;
            if (apjhVar == null) {
                apjhVar = apjh.a;
            }
        } else {
            apjhVar = null;
        }
        if (apjhVar != null) {
            aihl aihlVar = airp.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjhVar.c(aihlVarCheckIsLite);
            if (apjhVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjhVar.c(aihlVarCheckIsLite2);
                Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
                wnsVar = new wns((airg) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
        return wnsVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    public int[] getPipelineStrategy() {
        ElementsServices elementsServices = (ElementsServices) this.a;
        qpu qpuVarB = elementsServices.B();
        int i = ((aga) qpuVarB.b).e;
        ?? r0 = qpuVarB.a;
        int[] iArr = new int[((i + (r0 == 0 ? 0 : r0.size())) << 1) + 1];
        iArr[0] = 0;
        qpu qpuVarB2 = elementsServices.B();
        final gpd gpdVar = new gpd(iArr, 4);
        ((aga) qpuVarB2.b).b(new awqk() { // from class: opb
            @Override // defpackage.awqk
            public final Object invoke(Object obj, Object obj2) {
                gpdVar.accept((Integer) obj, obj2);
                return awmy.a;
            }
        });
        ?? r4 = qpuVarB2.a;
        if (r4 != 0) {
            j$.util.Map.EL.forEach(r4, new BiConsumer() { // from class: opc
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Object objIo = ((awmd) obj2).io();
                    gpdVar.accept((Integer) obj, objIo);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
        }
        return iArr;
    }

    public final wnt h() {
        if (this.b == null) {
            for (alla allaVar : ((alkz) this.a).d) {
                int i = allaVar.b;
                if (i == 77108254) {
                    this.b = new wnt(i == 77108254 ? (airj) allaVar.c : airj.a);
                    break;
                }
            }
        }
        return (wnt) this.b;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public final List i() {
        if (this.c == null) {
            LinkedList linkedList = new LinkedList();
            for (alla allaVar : ((alkz) this.a).d) {
                int i = allaVar.b;
                if (i == 77108254) {
                    for (airi airiVar : (i == 77108254 ? (airj) allaVar.c : airj.a).c) {
                        int i2 = airiVar.b;
                        if (i2 == 63434476) {
                            for (airf airfVar : (i2 == 63434476 ? (airg) airiVar.c : airg.a).c) {
                                int i3 = airfVar.b;
                                if (i3 == 62381864) {
                                    wnq wnqVar = new wnq(i3 == 62381864 ? (airb) airfVar.c : airb.a);
                                    wnqVar.a().getClass();
                                    ajwo ajwoVarD = wnqVar.d();
                                    aihl aihlVarCheckIsLite = aihn.checkIsLite(appf.b);
                                    ajwoVarD.c(aihlVarCheckIsLite);
                                    if (!ajwoVarD.j.n(aihlVarCheckIsLite.d)) {
                                        linkedList.add(wnqVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.c = DesugarCollections.unmodifiableList(linkedList);
        }
        return this.c;
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        wnt wntVarH = h();
        if (wntVarH != null) {
            Iterator it = wntVarH.c().iterator();
            while (it.hasNext()) {
                x((wns) it.next(), arrayList);
            }
        }
        wns wnsVarG = g();
        if (wnsVarG != null) {
            x(wnsVarG, arrayList);
        }
        return agke.n(arrayList);
    }

    public final byte[] k() {
        return ((alkz) this.a).g.G();
    }

    public final sgp l() {
        Object obj = this.b;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: externalContext");
        }
        return new sgp((skh) obj, (Optional) this.a, (Optional) this.c);
    }

    public final void m(String str) {
        this.c = Optional.of(str);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, opi] */
    public int[] measure(int i, long j, long j2, long[] jArr, long[] jArr2, int i2, int i3, boolean z, long j3, int i4) {
        abk abkVar = new abk();
        Size sizeW = w(i, j, j2, jArr, jArr2, i2, i3, z, j3, i4, abkVar);
        Object obj = abkVar.a;
        ?? r15 = this.b;
        if (r15 != 0 && obj != null) {
            r15.d(j3, i4, obj);
        }
        return new int[]{sizeW.getWidth(), sizeW.getHeight()};
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, opi] */
    public long measureV2(int i, long j, long j2, long[] jArr, long[] jArr2, int i2, int i3, boolean z, long j3, int i4) {
        abk abkVar = new abk();
        Size sizeW = w(i, j, j2, jArr, jArr2, i2, i3, z, j3, i4, abkVar);
        Object obj = abkVar.a;
        ?? r15 = this.b;
        if (r15 != 0 && obj != null) {
            r15.d(j3, i4, obj);
        }
        return (((long) sizeW.getWidth()) << 32) | (((long) sizeW.getHeight()) & 4294967295L);
    }

    public final void n(skh skhVar) {
        if (skhVar == null) {
            throw new NullPointerException("Null externalContext");
        }
        this.b = skhVar;
    }

    public final void o(float f) {
        float[] fArr = (float[]) this.b;
        double dAtan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        float[] fArr2 = (float[]) this.c;
        double d = (float) dAtan2;
        double d2 = f;
        fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d) * d2));
        float[] fArr3 = (float[]) this.c;
        fArr3[1] = (float) (((double) fArr3[1]) + (d2 * Math.sin(d)));
    }

    public final void p(float f) {
        float[] fArr = (float[]) this.b;
        float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
        float[] fArr2 = (float[]) this.c;
        double d = fAtan2;
        double d2 = f;
        fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d) * d2));
        float[] fArr3 = (float[]) this.c;
        fArr3[1] = (float) (((double) fArr3[1]) + (d2 * Math.sin(d)));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, opi] */
    public boolean prepare(int i, long j, long j2, long[] jArr, long[] jArr2, long j3, int i2, int i3, int i4, int i5, int i6, boolean z, long j4, long j5, int i7) throws Throwable {
        Object objA;
        ElementsServices elementsServices = (ElementsServices) this.a;
        opm opmVarI = elementsServices.I(i);
        boolean zL = true;
        if (opmVarI != null) {
            Throwable th = null;
            mew mewVar = new mew(u(j, j2, atoe.a), (byte[][]) null);
            mew mewVar2 = new mew(u(j4, j5, atlb.a));
            abk abkVar = new abk();
            Object obj = this.b;
            if (obj != null) {
                agp agpVar = ((ElementsRuntimeImpl) obj).f;
                synchronized (agpVar) {
                    aga agaVar = (aga) agpVar.a(j3);
                    objA = agaVar != null ? agaVar.a(i2) : null;
                }
                if (objA != null) {
                    abkVar.a = objA;
                }
            }
            oon oonVarV = v(jArr, jArr2);
            int i8 = 4;
            int[] iArr = {1, 2, 3, 4};
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i8;
                int i11 = iArr[i9];
                Throwable th2 = th;
                int i12 = i11 - 1;
                if (i11 == 0) {
                    throw th2;
                }
                if (i12 == i7) {
                    zL = opmVarI.l(mewVar.d(opmVarI.b()), elementsServices, oonVarV, i3, i4, i5, i6, z, mewVar2, abkVar, i11);
                    Object obj2 = abkVar.a;
                    ?? r0 = this.b;
                    if (r0 != 0) {
                        if (obj2 != null) {
                            r0.d(j3, i2, obj2);
                        } else {
                            agp agpVar2 = ((ElementsRuntimeImpl) r0).f;
                            synchronized (agpVar2) {
                                aga agaVar2 = (aga) agpVar2.a(j3);
                                if (agaVar2 != null) {
                                    agaVar2.e(i2);
                                }
                            }
                        }
                    }
                } else {
                    i9++;
                    th = th2;
                    i8 = i10;
                }
            }
            throw new IllegalArgumentException(a.bR(i7, "Unknown FlatteningMode value: "));
        }
        return zL;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean prepareLayer(long j, int i, int i2, int i3, int i4, int i5, boolean z, long j2, long j3) {
        oux ouxVar;
        ArrayList arrayList;
        Object objA;
        mew mewVar = new mew(u(j2, j3, atlb.a));
        Object obj = this.b;
        ous ousVar = null;
        if (obj != null) {
            agp agpVar = ((ElementsRuntimeImpl) obj).g;
            synchronized (agpVar) {
                aga agaVar = (aga) agpVar.a(j);
                objA = agaVar != null ? agaVar.a(i) : null;
            }
            if (objA instanceof ous) {
                ousVar = (ous) objA;
            }
        }
        if (ousVar == null) {
            ousVar = new ous();
        }
        ousVar.a = i;
        ousVar.t(i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT >= 29) {
            long j4 = mewVar.c;
            boolean z2 = false;
            float fIntBitsToFloat = (Memory.peekByte(8 + j4) & 4) != 0 ? Float.intBitsToFloat(Memory.peekInt(j4 + 36, false)) : 1.0f;
            if (Memory.peekByte(mewVar.c + 25) == 0 || (arrayList = ousVar.c) == null || arrayList.size() != 1 || !((PaintUnit) ousVar.c.get(0)).o(fIntBitsToFloat)) {
                ArrayList arrayList2 = ousVar.c;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    ((PaintUnit) ousVar.c.get(0)).o(1.0f);
                }
            } else {
                fIntBitsToFloat = 1.0f;
            }
            long j5 = mewVar.c;
            float fIntBitsToFloat2 = (Memory.peekByte(j5 + 11) & 8) != 0 ? Float.intBitsToFloat(Memory.peekInt(j5 + 112, false)) : 1.0f;
            long j6 = mewVar.c;
            float fIntBitsToFloat3 = (Memory.peekByte(11 + j6) & 16) != 0 ? Float.intBitsToFloat(Memory.peekInt(j6 + 116, false)) : 1.0f;
            float fIntBitsToFloat4 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 48, false));
            float fIntBitsToFloat5 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 52, false));
            float fIntBitsToFloat6 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 56, false));
            if (fIntBitsToFloat < 1.0f || fIntBitsToFloat2 != 1.0f || fIntBitsToFloat3 != 1.0f || fIntBitsToFloat4 != 0.0f || fIntBitsToFloat5 != 0.0f || fIntBitsToFloat6 != 0.0f || Memory.peekByte(mewVar.c + 18) != 0 || ((ouxVar = ousVar.d) != null && ouxVar.a)) {
                z2 = true;
            }
            if (Build.VERSION.SDK_INT >= 31 && (Memory.peekByte(mewVar.c + 9) & 32) != 0) {
                ousVar.c();
                ousVar.d();
            } else if (z2) {
                ousVar.c();
            }
            ouv ouvVar = ousVar.b;
            if (ouvVar != null) {
                ouvVar.d();
            }
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            agp agpVar2 = ((ElementsRuntimeImpl) obj2).g;
            synchronized (agpVar2) {
                aga agaVar2 = (aga) agpVar2.a(j);
                if (agaVar2 == null) {
                    agaVar2 = new aga(6);
                    agpVar2.d(j, agaVar2);
                }
                agaVar2.d(i, ousVar);
            }
        }
        return true;
    }

    public final void q() {
        Arrays.fill((float[]) this.c, 0.0f);
        Arrays.fill((float[]) this.b, 0.0f);
        ((float[]) this.b)[0] = 1.0f;
        ((Matrix) this.a).reset();
    }

    public final void r(float f) {
        Matrix matrix = (Matrix) this.a;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.c);
        matrix.mapPoints((float[]) this.b);
    }

    public final void s(float f) {
        float[] fArr = (float[]) this.c;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = (float[]) this.b;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    public final void t(float f) {
        float[] fArr = (float[]) this.c;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public ovo(Object obj) {
        this.a = obj;
    }

    public ovo(rmp rmpVar) {
        this.a = rmpVar;
        this.b = null;
        this.c = null;
    }

    public ovo(byte[] bArr) {
        this.a = new int[2];
    }

    public ovo(char[] cArr) {
        this.a = Optional.empty();
        this.c = Optional.empty();
    }

    public ovo(short[] sArr) {
        this.c = new float[2];
        this.b = new float[]{1.0f, 0.0f};
        this.a = new Matrix();
    }

    public ovo(ovo ovoVar) {
        this((float[]) ovoVar.c, (float[]) ovoVar.b);
    }

    public ovo() {
        this.a = new Object();
    }
}
