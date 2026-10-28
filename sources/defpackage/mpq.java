package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.EnumMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpq implements nvq {
    private final awmd a;
    private final aunn b;
    private final boolean c;

    public mpq(awmd awmdVar, aunn aunnVar, agev agevVar) {
        this.a = awmdVar;
        this.b = aunnVar;
        this.c = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.nvq
    public final aigw a() {
        return DirectUpdatePropertiesOuterClass$DirectUpdateProperties.b;
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = (DirectUpdatePropertiesOuterClass$DirectUpdateProperties) obj;
        ByteStore byteStore = (ByteStore) ((agev) this.a.io()).f();
        if (byteStore == null) {
            throw new nud("ByteStore is not provided");
        }
        ntqVar.v(new mjs(fhdVar.c().getDisplayMetrics(), byteStore, (DirectUpdateDataRelay) this.b.io(), directUpdatePropertiesOuterClass$DirectUpdateProperties, new EnumMap(asmn.class), this.c));
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        throw null;
    }
}
