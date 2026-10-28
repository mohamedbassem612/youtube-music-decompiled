package app.rive.runtime.kotlin.core;

import defpackage.a;
import defpackage.awqg;
import defpackage.eqf;
import defpackage.eqh;
import defpackage.eqk;
import defpackage.eqo;
import defpackage.eqq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class BytesRequest extends eqk {
    public static final int $stable = 8;
    private final awqg onResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BytesRequest(String str, awqg awqgVar, eqo eqoVar) {
        super(0, str, eqoVar);
        str.getClass();
        awqgVar.getClass();
        eqoVar.getClass();
        this.onResponse = awqgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eqk
    public void deliverResponse(byte[] bArr) {
        bArr.getClass();
        this.onResponse.invoke(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:3:0x0002, B:6:0x0009, B:5:0x0006), top: B:11:0x0002 }] */
    @Override // defpackage.eqk
    protected eqq parseNetworkResponse(eqf eqfVar) {
        Object obj;
        if (eqfVar != null) {
            try {
                obj = eqfVar.b;
                if (obj == null) {
                    obj = new byte[0];
                }
            } catch (Exception e) {
                return new eqq(new eqh(e));
            }
        } else {
            obj = new byte[0];
        }
        return new eqq(obj, a.bF(eqfVar));
    }
}
