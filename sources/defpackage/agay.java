package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agay extends InstanceProxy {
    public final agcg a;

    public agay(agcg agcgVar) {
        this.a = agcgVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '906540920'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '906540920'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -440699597 || i == 1823224507;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        ajuj ajujVar;
        int i2 = 4;
        if (i != -440699597) {
            if (i != 1823224507) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '906540920'."));
            }
            aigv aigvVar = (aigv) aihn.parseFrom(aigv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcg agcgVar = this.a;
            aigvVar.getClass();
            aclj acljVar = ((aclk) agcgVar.a).b;
            aihf aihfVarCreateBuilder = ashr.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            int i3 = acljVar.b;
            aihfVarCreateBuilder.copyOnWrite();
            ashr ashrVar = (ashr) aihfVarCreateBuilder.instance;
            ashrVar.c = i3 - 1;
            ashrVar.b |= 1;
            ajuj ajujVar2 = acljVar.a;
            if (ajujVar2 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                ashr ashrVar2 = (ashr) aihfVarCreateBuilder.instance;
                ashrVar2.d = ajujVar2;
                ashrVar2.b |= 2;
            }
            int i4 = acljVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            ashr ashrVar3 = (ashr) aihfVarCreateBuilder.instance;
            ashrVar3.e = i4 == 1 ? aiif.a() : i4 - 2;
            ashrVar3.b |= 4;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            return ((ashr) aihnVarBuild).toByteArray();
        }
        ashs ashsVar = (ashs) aihn.parseFrom(ashs.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcg agcgVar2 = this.a;
        ashsVar.getClass();
        if ((ashsVar.b & 2) != 0) {
            ajujVar = ashsVar.d;
            if (ajujVar == null) {
                ajujVar = ajuj.a;
            }
        } else {
            ajujVar = null;
        }
        Object obj = agcgVar2.a;
        int iAo = ahng.ao(ashsVar.c);
        if (iAo == 0) {
            iAo = 1;
        }
        switch (ashsVar.e) {
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 11;
                break;
            case 10:
                i2 = 12;
                break;
            case 11:
                i2 = 13;
                break;
            case 12:
                i2 = 14;
                break;
            case 13:
                i2 = 15;
                break;
            case 14:
                i2 = 16;
                break;
            case 15:
                i2 = 17;
                break;
            case 16:
                i2 = 18;
                break;
            case 17:
                i2 = 19;
                break;
            case 18:
                i2 = 20;
                break;
            case 19:
                i2 = 21;
                break;
            case 20:
                i2 = 22;
                break;
            case 21:
                i2 = 23;
                break;
            case 22:
                i2 = 24;
                break;
            case 23:
                i2 = 25;
                break;
            case 24:
                i2 = 26;
                break;
            case 25:
                i2 = 27;
                break;
            default:
                i2 = 0;
                break;
        }
        aclj acljVar2 = new aclj(iAo, ajujVar, i2 != 0 ? i2 : 1);
        aclk aclkVar = (aclk) obj;
        aclkVar.b = acljVar2;
        Iterator it = aclkVar.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((ink) next).d(acljVar2);
        }
        aigv aigvVar2 = aigv.a;
        aigvVar2.getClass();
        return aigvVar2.toByteArray();
    }
}
