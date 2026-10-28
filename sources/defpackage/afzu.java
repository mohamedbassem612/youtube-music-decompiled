package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzu extends InstanceProxy {
    public final agcg a;

    public afzu(agcg agcgVar) {
        this.a = agcgVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '983280355'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '983280355'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -439500900;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [awqg, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i != -439500900) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '983280355'."));
        }
        aijm aijmVar = (aijm) aihn.parseFrom(aijm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcg agcgVar = this.a;
        aijmVar.getClass();
        String str = aijmVar.b;
        str.getClass();
        if (str.length() != 0) {
            Object obj = agcgVar.a;
            awrm awrmVar = new awrm();
            awrm awrmVar2 = new awrm();
            jah jahVar = (jah) obj;
            Set set = jahVar.l;
            synchronized (set) {
                if (((jah) obj).g != null) {
                    if (!set.add(str)) {
                        set.remove(str);
                        set.add(str);
                    } else if (set.size() > 128) {
                        String str2 = (String) atqq.W(set);
                        set.remove(str2);
                        awrmVar.a = str2;
                    }
                    Long l = ((jah) obj).k;
                    byte[] bArr2 = null;
                    boolean z = false;
                    if (l != null) {
                        ((jah) obj).k = null;
                        if (SystemClock.elapsedRealtime() - l.longValue() <= 1000) {
                            z = true;
                        } else {
                            ((jah) obj).i = 1.0f;
                            awrmVar2.a = Float.valueOf(1.0f);
                        }
                    } else if (((jah) obj).j || ((jah) obj).i > 0.0f) {
                        awrmVar2.a = Float.valueOf(((jah) obj).i);
                    }
                    if (awrmVar.a != null) {
                        Optional optional = jahVar.d;
                        imc imcVar = new imc(new hol(awrmVar, 13), 16);
                        optional.isPresent();
                        imcVar.a.invoke(optional.get());
                    }
                    if (z) {
                        if (awrc.c(Looper.myLooper(), Looper.getMainLooper())) {
                            jahVar.d();
                        } else {
                            jahVar.f.e(new ixe(obj, 2));
                        }
                    } else if (awrmVar2.a != null) {
                        Optional optional2 = jahVar.d;
                        imc imcVar2 = new imc(new apm(str, awrmVar2, 18, bArr2), 15);
                        optional2.isPresent();
                        imcVar2.a.invoke(optional2.get());
                    }
                }
            }
        }
        aigv aigvVar = aigv.a;
        aigvVar.getClass();
        return aigvVar.toByteArray();
    }
}
