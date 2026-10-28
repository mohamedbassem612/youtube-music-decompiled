package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class zs {
    public final Object a;

    public zs(short[] sArr) {
        this.a = new PriorityQueue(10, new aqv(6));
    }

    private final boolean H(cvj cvjVar, int i) {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    byte[] bArr = ((bwb) this.a).b;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                Object obj = this.a;
                int i6 = i4 + 10;
                ((cvb) cvjVar).n(((bwb) obj).b, i6 - i5, i5, false);
                bwb bwbVar = (bwb) obj;
                bwbVar.P(i2);
                bwbVar.O(i6);
                if (bwbVar.d() < 3) {
                    throw new IndexOutOfBoundsException("position=" + bwbVar.c + ", limit=" + bwbVar.d);
                }
                int iP = bwbVar.p();
                bwbVar.c -= 3;
                if (iP == 4801587) {
                    bwbVar.Q(3);
                    if (cyg.d(bwbVar.n())) {
                        ((bwb) this.a).P(i2);
                        return true;
                    }
                } else if (cvv.a(bwbVar.g()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    bwbVar.H(20);
                }
                i3++;
            } catch (EOFException unused) {
                return false;
            }
        } while (i3 <= i);
        return false;
    }

    public static zs f(int i, int i2) {
        return new zs(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false), (byte[]) null);
    }

    public static zs g(int i, int i2, int i3, int i4, boolean z) {
        return new zs(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), (byte[]) null);
    }

    public static zs h(int i, int i2, boolean z, int i3) {
        return new zs(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3), (byte[]) null);
    }

    public final void A(long j) {
        ((tyt) this.a).e("sq", Long.toString(j));
    }

    public final void B(int i, String str) {
        alos alosVar = (alos) alou.a.createBuilder();
        aihf aihfVarCreateBuilder = akjv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akjv akjvVar = (akjv) aihfVarCreateBuilder.instance;
        akjvVar.d = Integer.valueOf(i - 1);
        akjvVar.c = 1;
        aihfVarCreateBuilder.copyOnWrite();
        akjv akjvVar2 = (akjv) aihfVarCreateBuilder.instance;
        str.getClass();
        akjvVar2.b |= 2;
        akjvVar2.f = str;
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        akjv akjvVar3 = (akjv) aihfVarCreateBuilder.build();
        akjvVar3.getClass();
        alouVar.d = akjvVar3;
        alouVar.c = 392;
        ((dov) this.a).R((alou) alosVar.build());
    }

    public final void C(int i, String str, String str2) {
        alos alosVar = (alos) alou.a.createBuilder();
        aihf aihfVarCreateBuilder = akjv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akjv akjvVar = (akjv) aihfVarCreateBuilder.instance;
        akjvVar.d = Integer.valueOf(i - 1);
        akjvVar.c = 1;
        aihfVarCreateBuilder.copyOnWrite();
        akjv akjvVar2 = (akjv) aihfVarCreateBuilder.instance;
        str.getClass();
        akjvVar2.b |= 2;
        akjvVar2.f = str;
        aihfVarCreateBuilder.copyOnWrite();
        akjv akjvVar3 = (akjv) aihfVarCreateBuilder.instance;
        str2.getClass();
        akjvVar3.b |= 4;
        akjvVar3.g = str2;
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        akjv akjvVar4 = (akjv) aihfVarCreateBuilder.build();
        akjvVar4.getClass();
        alouVar.d = akjvVar4;
        alouVar.c = 392;
        ((dov) this.a).R((alou) alosVar.build());
    }

    public final void D(String str, vlr vlrVar) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Key cannot be empty");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(str);
        if (awrc.c(weakReference != null ? (vlr) weakReference.get() : null, vlrVar)) {
            concurrentHashMap.remove(str, weakReference);
        }
    }

    public final boolean E() {
        ardm ardmVar = ((vyo) this.a).b().q;
        if (ardmVar == null) {
            ardmVar = ardm.a;
        }
        return ardmVar.c;
    }

    public final vkq F(auir auirVar) {
        return (vkq) ((EnumMap) this.a).get(auirVar);
    }

    public final Set G() {
        return ((EnumMap) this.a).keySet();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void a() {
        ?? r2 = this.a;
        int size = r2.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((bde) ((ArrayList) r2).get(size)).a();
            }
        }
    }

    public final ClipDescription b() {
        return ((bcp) this.a).a.getDescription();
    }

    public final Uri c() {
        return ((bcp) this.a).a.getContentUri();
    }

    public final Uri d() {
        return ((bcp) this.a).a.getLinkUri();
    }

    public final void e() {
        ((bcp) this.a).a.requestPermission();
    }

    public final boolean i() {
        abyu abyuVar = (abyu) ((zs) this.a).a;
        return abyuVar.c && abyuVar.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int j() {
        return this.a.size();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    public final cuz k() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (cuz cuzVar : this.a.values()) {
            arrayList.add(cuzVar.b);
            arrayList2.add(cuzVar.c);
            arrayList3.add(cuzVar.d);
            arrayList4.add(cuzVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int[] iArr3 = new int[afxw.N(length)];
        int i = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i, length2);
            i += length2;
        }
        return new cuz(iArr3, ahng.I((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), ahng.I((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), ahng.I((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void l(cuz cuzVar) {
        long[] jArr = cuzVar.e;
        if (jArr.length > 0) {
            ?? r4 = this.a;
            if (r4.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            r4.put(Long.valueOf(jArr[0]), cuzVar);
        }
    }

    public final bsx m(cvj cvjVar, bcy bcyVar, int i) {
        bsx bsxVarC = null;
        int i2 = 0;
        while (H(cvjVar, i)) {
            bwb bwbVar = (bwb) this.a;
            int i3 = bwbVar.c;
            bwbVar.Q(6);
            int iM = bwbVar.m();
            int i4 = iM + 10;
            cvb cvbVar = (cvb) cvjVar;
            long j = cvbVar.a;
            if (j != -1 && cvjVar.e() + ((long) iM) > j) {
                bvx.e("Id3Peeker", "Skipping ID3 tag with tagLength=" + i4 + " greater than input length=" + j);
                break;
            }
            if (bsxVarC == null) {
                byte[] bArr = new byte[i4];
                System.arraycopy(bwbVar.b, i3, bArr, 0, 10);
                cvbVar.n(bArr, 10, iM, false);
                bsxVarC = new cyg(bcyVar).c(bArr, i4);
            } else {
                cvbVar.m(iM, false);
            }
            i2 += i4;
        }
        cvjVar.k();
        ((cvb) cvjVar).m(i2, false);
        return bsxVarC;
    }

    public final int n() {
        return ((erb[]) this.a).length;
    }

    public final bty o(Context context, bru bruVar, brx brxVar, cti ctiVar, Executor executor) {
        try {
            return ((zs) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(btw.class).newInstance(this.a)).o(context, bruVar, brxVar, ctiVar, executor);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public final erb p() {
        return ((erb[]) this.a)[0];
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    public final void q(Predicate predicate) {
        Collection.EL.removeIf(this.a, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final boolean r() {
        return this.a.isEmpty();
    }

    public final boolean s() {
        aomk aomkVar;
        alik alikVarB = ((vyo) this.a).b();
        if (alikVarB == null || (aomkVar = alikVarB.s) == null) {
            aomkVar = aomk.a;
        }
        return aomkVar.b;
    }

    public final ListenableFuture t(wrw wrwVar) {
        ArrayList arrayList = new ArrayList();
        agqr it = ((agpr) this.a).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((wro) next).a()) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            String str = ((aolj) wrwVar.a().instance).d;
            str.getClass();
            return ahng.m(new IllegalStateException(a.bU((byte) 39, str, "No registered handler can process the request for panel ID '")));
        }
        if (arrayList.size() > 1) {
            String str2 = ((aolj) wrwVar.a().instance).d;
            str2.getClass();
            ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((wro) it2.next()).getClass().getName());
            }
            twu.d("ClientPanelHandlerRegistry", 6, "Multiple handlers matched request for panel ID '" + str2 + "': " + arrayList2, null);
        }
        return ((wro) atqq.X(arrayList)).b();
    }

    public final ajqb u() {
        ajqb ajqbVar = ((almq) this.a).d;
        return ajqbVar == null ? ajqb.a : ajqbVar;
    }

    public final ajwo v() {
        almq almqVar = (almq) this.a;
        if ((almqVar.b & 4) == 0) {
            return null;
        }
        ajwo ajwoVar = almqVar.e;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    public final byte[] w() {
        almq almqVar = (almq) this.a;
        if ((almqVar.b & 16) != 0) {
            return almqVar.f.G();
        }
        return null;
    }

    public final Uri x() {
        return ((tyt) this.a).a();
    }

    public final void y(String str) {
        Object obj = this.a;
        if (str == null) {
            ((tyt) obj).h("cpn");
        } else {
            ((tyt) obj).e("cpn", str);
        }
    }

    public final void z(long j) {
        Object obj = this.a;
        if (j <= 0) {
            ((tyt) obj).h("mpr");
        } else {
            ((tyt) obj).e("mpr", Long.toString(j));
        }
    }

    public zs(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public zs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = cqb.a;
    }

    public zs() {
        this.a = new ArrayList();
    }

    public zs(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new csh();
    }

    public zs(byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        this.a = new EnumMap(auir.class);
    }

    public zs(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new AtomicReference();
    }

    public zs(char[] cArr) {
        this.a = new cth();
    }

    public zs(byte[] bArr, byte[] bArr2) {
        this.a = new LinkedHashMap();
    }

    public zs(byte[] bArr, char[] cArr) {
        this.a = new ConcurrentHashMap();
        new CopyOnWriteArraySet();
    }

    public zs(byte[] bArr) {
        this.a = new bwb(10);
    }

    public zs(Uri uri) {
        this.a = new tyt(uri);
    }

    public zs(Optional optional) {
        optional.isPresent();
        this.a = (agkz) optional.orElse(agpr.a);
    }

    public zs(almq almqVar) {
        almqVar.getClass();
        this.a = almqVar;
    }

    public zs(Set set) {
        set.getClass();
        this.a = set;
    }

    public zs(xeu xeuVar) {
        xeuVar.getClass();
        this.a = xeuVar;
    }

    public zs(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public zs(Object obj) {
        this.a = obj;
    }
}
