package defpackage;

import android.os.Bundle;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yyj implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yyj(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i;
        int i2 = this.$cid;
        Float fValueOf = Float.valueOf(0.0f);
        if (i2 == 0) {
            zhl zhlVar = (zhl) this.a;
            return Float.valueOf(zhlVar.a() != 0.0f ? zhlVar.a() : ((Float) ((wiu) this.b).P().orElse(fValueOf)).floatValue());
        }
        if (i2 == 1) {
            Object obj = this.a;
            if (obj != null) {
                aofc aofcVar = (aofc) obj;
                if ((aofcVar.b & SemanticState.LiveRegion) != 0) {
                    i = aofcVar.j;
                } else {
                    i = ((aamj) this.b).a.d;
                }
            } else {
                i = ((aamj) this.b).a.d;
            }
            return Long.valueOf(i);
        }
        if (i2 == 2) {
            zhl zhlVar2 = (zhl) this.a;
            return Float.valueOf(zhlVar2.b() != 0.0f ? zhlVar2.b() : ((Float) ((wiu) this.b).P().orElse(fValueOf)).floatValue());
        }
        Object objOfNullable = this.a;
        if (i2 == 3) {
            return nra.b(agke.q(this.b), (Bundle) objOfNullable);
        }
        Optional optional = (Optional) objOfNullable;
        if (true == optional.isPresent()) {
            objOfNullable = Optional.ofNullable(null);
        }
        Optional optional2 = (Optional) objOfNullable;
        if (true == optional2.isPresent()) {
            objOfNullable = Optional.ofNullable(Boolean.valueOf(((acpp) optional2.get()).a()));
        }
        return (Boolean) ((Optional) objOfNullable).orElse(Boolean.valueOf(((acqz) this.b).ai));
    }

    public /* synthetic */ yyj(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
