package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axst {
    public final Object a;

    public axst(axst axstVar, axss axssVar) {
        GifInfoHandle gifInfoHandle = new GifInfoHandle((byte[]) axstVar.a);
        this.a = gifInfoHandle;
        GifInfoHandle.setOptions(gifInfoHandle.a, axssVar.a, false);
    }

    public final void A(float f) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= 1;
        ahzmVar.c = f;
    }

    public final void B(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= 64;
        ahzmVar.i = str;
    }

    public final void C(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= SemanticState.Focused;
        ahzmVar.j = str;
    }

    public final void D(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= 32;
        ahzmVar.h = str;
    }

    public final void E(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= 4;
        ahzmVar.e = str;
    }

    public final /* synthetic */ void F(Iterable iterable) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        aiie aiieVar = ahzmVar.m;
        if (!aiieVar.c()) {
            ahzmVar.m = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, ahzmVar.m);
    }

    public final /* synthetic */ void G(Iterable iterable) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        aiie aiieVar = ahzmVar.n;
        if (!aiieVar.c()) {
            ahzmVar.n = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, ahzmVar.n);
    }

    public final void H(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.s = i - 1;
        ahzmVar.b |= 65536;
    }

    public final /* synthetic */ void I() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((ahzm) ((aihf) this.a).instance).m);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public final /* synthetic */ void J() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((ahzm) ((aihf) this.a).instance).n);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public final void K() {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.d = 3;
        ahzmVar.b |= 2;
    }

    public final /* synthetic */ ahyh L() {
        aihn aihnVarBuild = ((aihf) this.a).build();
        aihnVarBuild.getClass();
        return (ahyh) aihnVarBuild;
    }

    public final void M(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.b |= 1;
        ahyhVar.d = str;
    }

    public final void N(long j) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.b |= SemanticState.LiveRegion;
        ahyhVar.l = j;
    }

    public final void O(ahyp ahypVar) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.j = ahypVar;
        ahyhVar.b |= 64;
    }

    public final void P(long j) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.b |= 8;
        ahyhVar.g = j;
    }

    public final void Q(ahyv ahyvVar) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.m = ahyvVar;
        ahyhVar.b |= SemanticState.Modal;
    }

    public final void R(long j) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.b |= SemanticState.Hidden;
        ahyhVar.k = j;
    }

    public final void S(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.b |= 2;
        ahyhVar.e = str;
    }

    public final void T(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.b |= 4;
        ahyhVar.f = str;
    }

    public final void U(ahzn ahznVar) {
        ahznVar.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.h = ahznVar;
        ahyhVar.b |= 16;
    }

    public final void V(String str) {
        str.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.b |= SemanticState.Obscured;
        ahyhVar.n = str;
    }

    public final void W(ahzs ahzsVar) {
        ahzsVar.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        ahyhVar.i = ahzsVar;
        ahyhVar.b |= 32;
    }

    public final /* synthetic */ void X(Iterable iterable) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahyh ahyhVar = (ahyh) aihfVar.instance;
        ahyh ahyhVar2 = ahyh.a;
        aiie aiieVar = ahyhVar.c;
        if (!aiieVar.c()) {
            ahyhVar.c = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, ahyhVar.c);
    }

    public final /* synthetic */ void Y() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((ahyh) ((aihf) this.a).instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public final int a() {
        return ((GifInfoHandle) this.a).a();
    }

    public final int b(int i) {
        return ((GifInfoHandle) this.a).b(i);
    }

    public final int c() {
        return ((GifInfoHandle) this.a).c();
    }

    public final int d() {
        return ((GifInfoHandle) this.a).d();
    }

    public final int e() {
        return ((GifInfoHandle) this.a).e();
    }

    public final long f(long j) {
        return ((AtomicLong) this.a).addAndGet(j);
    }

    public final int g() {
        return ((ByteBuffer) this.a).position();
    }

    public final int h() {
        return ((ByteBuffer) this.a).remaining();
    }

    public final void i(byte[] bArr, int i, int i2) {
        ((ByteBuffer) this.a).put(bArr, i, i2);
    }

    public final /* synthetic */ alwy j() {
        aihn aihnVarBuild = ((aihf) this.a).build();
        aihnVarBuild.getClass();
        return (alwy) aihnVarBuild;
    }

    public final void k(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        alwy alwyVar = (alwy) aihfVar.instance;
        alwy alwyVar2 = alwy.a;
        alwyVar.b |= 64;
        alwyVar.i = i;
    }

    public final void l(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        alwy alwyVar = (alwy) aihfVar.instance;
        alwy alwyVar2 = alwy.a;
        alwyVar.b |= 4;
        alwyVar.e = i;
    }

    public final void m(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        alwy alwyVar = (alwy) aihfVar.instance;
        alwy alwyVar2 = alwy.a;
        alwyVar.b |= 2;
        alwyVar.d = i;
    }

    public final void n(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        alwy alwyVar = (alwy) aihfVar.instance;
        alwy alwyVar2 = alwy.a;
        alwyVar.b |= 16;
        alwyVar.g = i;
    }

    public final void o() {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        alwy alwyVar = (alwy) aihfVar.instance;
        alwy alwyVar2 = alwy.a;
        alwyVar.b |= 32;
        alwyVar.h = true;
    }

    public final void p(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        alwy alwyVar = (alwy) aihfVar.instance;
        alwy alwyVar2 = alwy.a;
        alwyVar.f = i - 1;
        alwyVar.b |= 8;
    }

    public final void q(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        alwy alwyVar = (alwy) aihfVar.instance;
        alwy alwyVar2 = alwy.a;
        alwyVar.c = i - 1;
        alwyVar.b |= 1;
    }

    public final /* synthetic */ aiax r() {
        aihn aihnVarBuild = ((aihf) this.a).build();
        aihnVarBuild.getClass();
        return (aiax) aihnVarBuild;
    }

    public final /* synthetic */ ahzm s() {
        aihn aihnVarBuild = ((aihf) this.a).build();
        aihnVarBuild.getClass();
        return (ahzm) aihnVarBuild;
    }

    public final void t(int i) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= SemanticState.Hidden;
        ahzmVar.k = i;
    }

    public final void u(ahzb ahzbVar) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.o = ahzbVar.d;
        ahzmVar.b |= SemanticState.Modal;
    }

    public final void v(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= 8;
        ahzmVar.f = str;
    }

    public final void w(String str) {
        str.getClass();
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= 16;
        ahzmVar.g = str;
    }

    public final void x(boolean z) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= SemanticState.Obscured;
        ahzmVar.p = z;
    }

    public final void y(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= SemanticState.Multiline;
        ahzmVar.q = str;
    }

    public final void z(String str) {
        aihf aihfVar = (aihf) this.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.b |= SemanticState.LiveRegion;
        ahzmVar.l = str;
    }

    public axst(byte[] bArr) {
        this.a = bArr;
    }

    public axst(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    public axst(char[] cArr) {
        this.a = new HashMap();
    }

    public axst() {
        this.a = new AtomicLong();
    }

    public axst(Object obj) {
        this.a = obj;
    }
}
