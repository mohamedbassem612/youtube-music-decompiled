package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class snn extends slb {
    protected snn(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, long j, sno snoVar) {
        super(str, bArr, str2, str3, z, wiuVar, str4, j, snoVar);
    }

    @Override // defpackage.slb
    public final ajwo F() {
        Optional optionalI = I(new snm(0), ajnp.a);
        if (true == optionalI.isPresent() && (((ajnf) optionalI.get()).b & SemanticState.Obscured) == 0) {
            optionalI = Optional.empty();
        }
        if (true == optionalI.isPresent()) {
            ajwo ajwoVar = ((ajnf) optionalI.get()).r;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            optionalI = Optional.ofNullable(ajwoVar);
        }
        return (ajwo) optionalI.orElse(null);
    }

    @Override // defpackage.slb
    public final apzz H() {
        return (apzz) I(new snm(1), aqab.a).orElse(apzz.a);
    }

    public final apzt ax() {
        return (apzt) I(new rxg(20), apzu.a).orElse(null);
    }
}
