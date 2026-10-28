package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lxq extends lwm implements lyq, ltu {
    public lxt a;
    private final lxt b;

    public lxq(lxt lxtVar) {
        this.b = lxtVar;
        if (lxtVar.H()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.a = a();
    }

    private final lxt a() {
        return this.b.x();
    }

    private static void d(lxt lxtVar, lxt lxtVar2) {
        lyw.a.a(lxtVar).g(lxtVar, lxtVar2);
    }

    public final void A(int i) {
        s();
        lvg lvgVar = (lvg) this.a;
        int i2 = lvg.QUERY_LENGTH_FIELD_NUMBER;
        lvgVar.bitField0_ |= 262144;
        lvgVar.nativeToJavaJniLatencyMs_ = i;
    }

    public final void B(lwk lwkVar) {
        s();
        lvl lvlVar = (lvl) this.a;
        int i = lvl.NUM_PER_PAGE_FIELD_NUMBER;
        lwkVar.getClass();
        lye lyeVar = lvlVar.typePropertyMasks_;
        if (!lyeVar.c()) {
            lvlVar.typePropertyMasks_ = lxt.A(lyeVar);
        }
        lvlVar.typePropertyMasks_.add(lwkVar);
    }

    public final lvg C() {
        return ((lvw) this.a).c();
    }

    public final void D(long j) {
        s();
        lvw lvwVar = (lvw) this.a;
        int i = lvw.STATUS_FIELD_NUMBER;
        lvwVar.bitField0_ |= 4;
        lvwVar.nextPageToken_ = j;
    }

    public final void E(lwf lwfVar) {
        s();
        lvw lvwVar = (lvw) this.a;
        int i = lvw.STATUS_FIELD_NUMBER;
        lwfVar.getClass();
        lvwVar.status_ = lwfVar;
        lvwVar.bitField0_ |= 1;
    }

    public final void F(lwk lwkVar) {
        s();
        lvx lvxVar = (lvx) this.a;
        int i = lvx.QUERY_FIELD_NUMBER;
        lwkVar.getClass();
        lye lyeVar = lvxVar.typePropertyFilters_;
        if (!lyeVar.c()) {
            lvxVar.typePropertyFilters_ = lxt.A(lyeVar);
        }
        lvxVar.typePropertyFilters_.add(lwkVar);
    }

    public final void G(int i) {
        s();
        lwf lwfVar = (lwf) this.a;
        int i2 = lwf.CODE_FIELD_NUMBER;
        lwfVar.code_ = i - 1;
        lwfVar.bitField0_ |= 1;
    }

    public int b() {
        throw null;
    }

    @Override // defpackage.ltu
    public final luz c(int i) {
        return ((ltt) this.a).c(i);
    }

    public String g() {
        return ((luw) this.a).schemaType_;
    }

    @Override // defpackage.lwm
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final lxq k() {
        lxq lxqVarU = this.b.B();
        lxqVarU.a = q();
        return lxqVarU;
    }

    public final lxt o() {
        lxt lxtVarQ = q();
        if (lxt.I(lxtVarQ)) {
            return lxtVarQ;
        }
        throw new lzf();
    }

    @Override // defpackage.lyo
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final lxt q() {
        boolean zH = this.a.H();
        lxt lxtVar = this.a;
        if (!zH) {
            return lxtVar;
        }
        lxtVar.C();
        return this.a;
    }

    @Override // defpackage.lyq
    public final /* bridge */ /* synthetic */ lyp r() {
        throw null;
    }

    public final void s() {
        if (this.a.H()) {
            return;
        }
        lxt lxtVarA = a();
        d(lxtVarA, this.a);
        this.a = lxtVarA;
    }

    public final void t(lxt lxtVar) {
        if (lxtVar != null && !this.b.getClass().isInstance(lxtVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (this.b.equals(lxtVar)) {
            return;
        }
        s();
        d(this.a, lxtVar);
    }

    @Override // defpackage.lwm
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(byte[] bArr, int i, lxl lxlVar) throws lyh {
        s();
        try {
            lyw.a.a(this.a).h(this.a, bArr, 0, i, new lwq(lxlVar));
        } catch (IndexOutOfBoundsException unused) {
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (lyh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    public final void v(jrw jrwVar) {
        s();
        jrx jrxVar = (jrx) this.a;
        int i = jrx.NOT_PLATFORM_SURFACEABLE_FIELD_NUMBER;
        jrwVar.getClass();
        jrxVar.publiclyVisibleTargetPackage_ = jrwVar;
        jrxVar.bitField0_ |= 2;
    }

    public final void w(String str) {
        s();
        ltt lttVar = (ltt) this.a;
        int i = ltt.NAMESPACE_FIELD_NUMBER;
        lttVar.bitField0_ |= 1;
        lttVar.namespace_ = str;
    }

    public final void x(String str) {
        s();
        ltt lttVar = (ltt) this.a;
        int i = ltt.NAMESPACE_FIELD_NUMBER;
        lttVar.bitField0_ |= 4;
        lttVar.schema_ = str;
    }

    public final void y(String str) {
        s();
        luw luwVar = (luw) this.a;
        int i = luw.PROPERTY_NAME_FIELD_NUMBER;
        str.getClass();
        luwVar.bitField0_ |= 8;
        luwVar.schemaType_ = str;
    }

    public final void z(int i) {
        s();
        luw luwVar = (luw) this.a;
        int i2 = luw.PROPERTY_NAME_FIELD_NUMBER;
        luwVar.scorableType_ = i - 1;
        luwVar.bitField0_ |= SemanticState.ReadOnly;
    }

    public lxq() {
        this(jru.DEFAULT_INSTANCE);
    }
}
