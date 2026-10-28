package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.research.xeno.effect.Effect;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class qvk extends qvc {
    public final Effect a;

    protected qvk(qvk qvkVar) {
        super(qvkVar);
        this.a = qvkVar.a;
    }

    @Override // defpackage.qvc
    public final String c() {
        Effect effect = this.a;
        effect.b();
        return (String) effect.b().e("Unknown xeno effect");
    }

    @Override // defpackage.qvc
    public final boolean e(Object obj) {
        if (!super.e(obj) || !(obj instanceof qvk)) {
            return false;
        }
        Effect effect = this.a;
        Effect effect2 = ((qvk) obj).a;
        if (!effect.equals(effect2)) {
            byte[] bArrE = effect.e();
            byte[] bArrE2 = effect2.e();
            if (!Arrays.equals(bArrE, bArrE2)) {
                if (bArrE == null || bArrE2 == null) {
                    return false;
                }
                try {
                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                    atut atutVar = atut.a;
                    atut atutVar2 = (atut) aihn.parseFrom(atutVar, bArrE, generatedRegistry);
                    atut atutVar3 = (atut) aihn.parseFrom(atutVar, bArrE2, ExtensionRegistryLite.getGeneratedRegistry());
                    atte atteVar = atutVar2.b;
                    if (atteVar == null) {
                        atteVar = atte.a;
                    }
                    atte atteVar2 = atutVar3.b;
                    if (atteVar2 == null) {
                        atteVar2 = atte.a;
                    }
                    if (!atteVar.equals(atteVar2) || !DesugarCollections.unmodifiableMap(atutVar2.c).keySet().equals(DesugarCollections.unmodifiableMap(atutVar3.c).keySet())) {
                        return false;
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public qvk clone() {
        return new qvk(this);
    }

    @Override // defpackage.qvc
    public final Object iv() {
        return this.a;
    }

    @Override // defpackage.qvc
    public final String toString() {
        return String.format(Locale.US, "XenoEffect{%s, xenoEffectHash=%d}", super.toString(), Integer.valueOf(this.a.hashCode()));
    }

    public qvk(Effect effect) {
        this.a = effect;
    }

    protected qvk(Effect effect, UUID uuid) {
        super(uuid);
        this.a = effect;
    }

    public qvk(Effect effect, byte[] bArr) {
        this.a = effect;
    }

    public void j() {
    }
}
