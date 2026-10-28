package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hel extends hej implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vj(17);
    public byte[] a;
    public hdt b = hdt.MUSIC_SEARCH_CATALOG;
    public String c = "";

    public hel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        this.f = vxg.b(bArr);
        this.k = parcel.readString();
    }

    public final apng a(hel helVar) {
        ajwo ajwoVar = helVar.f;
        if (ajwoVar == null) {
            return apng.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public final void b(aqjj aqjjVar) {
        if (this.h == null) {
            aihf aihfVarCreateBuilder = alxi.a.createBuilder();
            aihf aihfVarCreateBuilder2 = alxj.a.createBuilder();
            alxo alxoVar = alxo.a;
            aihfVarCreateBuilder2.copyOnWrite();
            alxj alxjVar = (alxj) aihfVarCreateBuilder2.instance;
            alxoVar.getClass();
            alxjVar.c = alxoVar;
            alxjVar.b = 60498879;
            aihfVarCreateBuilder.copyOnWrite();
            alxi alxiVar = (alxi) aihfVarCreateBuilder.instance;
            alxj alxjVar2 = (alxj) aihfVarCreateBuilder2.build();
            alxjVar2.getClass();
            alxiVar.d = alxjVar2;
            alxiVar.b |= 8;
            this.h = new wgc((alxi) aihfVarCreateBuilder.build());
        }
        wgc wgcVar = (wgc) this.h;
        alxi alxiVar2 = wgcVar.a;
        alxj alxjVar3 = alxiVar2.d;
        if (alxjVar3 == null) {
            alxjVar3 = alxj.a;
        }
        aihf builder = (alxjVar3.b == 60498879 ? (alxo) alxjVar3.c : alxo.a).toBuilder();
        aihf aihfVarCreateBuilder3 = alxm.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        alxm alxmVar = (alxm) aihfVarCreateBuilder3.instance;
        aqjjVar.getClass();
        alxmVar.c = aqjjVar;
        alxmVar.b = 58174010;
        builder.copyOnWrite();
        alxo alxoVar2 = (alxo) builder.instance;
        alxm alxmVar2 = (alxm) aihfVarCreateBuilder3.build();
        alxmVar2.getClass();
        alxoVar2.a();
        alxoVar2.b.add(alxmVar2);
        alxo alxoVar3 = (alxo) builder.build();
        aihf builder2 = alxjVar3.toBuilder();
        builder2.copyOnWrite();
        alxj alxjVar4 = (alxj) builder2.instance;
        alxoVar3.getClass();
        alxjVar4.c = alxoVar3;
        alxjVar4.b = 60498879;
        alxj alxjVar5 = (alxj) builder2.build();
        aihf builder3 = alxiVar2.toBuilder();
        builder3.copyOnWrite();
        alxi alxiVar3 = (alxi) builder3.instance;
        alxjVar5.getClass();
        alxiVar3.d = alxjVar5;
        alxiVar3.b |= 8;
        wgcVar.a = (alxi) builder3.build();
    }

    public final void c(hdt hdtVar) {
        if (hdtVar != null) {
            this.b = hdtVar;
        }
    }

    public final void d(hdt hdtVar, aqjg aqjgVar) {
        Object obj = this.h;
        if (obj != null) {
            wgc wgcVar = (wgc) obj;
            alxi alxiVar = wgcVar.a;
            alxj alxjVar = alxiVar.d;
            if (alxjVar == null) {
                alxjVar = alxj.a;
            }
            alxo alxoVar = alxjVar.b == 60498879 ? (alxo) alxjVar.c : alxo.a;
            for (int i = 0; i < alxoVar.b.size(); i++) {
                alxm alxmVar = (alxm) alxoVar.b.get(i);
                int i2 = alxmVar.b;
                if (i2 == 58174010) {
                    if ((i2 == 58174010 ? (aqjj) alxmVar.c : aqjj.a).c.equals(hdtVar.g)) {
                        aihf builder = (alxmVar.b == 58174010 ? (aqjj) alxmVar.c : aqjj.a).toBuilder();
                        builder.copyOnWrite();
                        aqjj aqjjVar = (aqjj) builder.instance;
                        aqjgVar.getClass();
                        aqjjVar.i = aqjgVar;
                        aqjjVar.b |= 16384;
                        aqjj aqjjVar2 = (aqjj) builder.build();
                        aihf builder2 = alxoVar.toBuilder();
                        aihf builder3 = alxmVar.toBuilder();
                        builder3.copyOnWrite();
                        alxm alxmVar2 = (alxm) builder3.instance;
                        aqjjVar2.getClass();
                        alxmVar2.c = aqjjVar2;
                        alxmVar2.b = 58174010;
                        builder2.copyOnWrite();
                        alxo alxoVar2 = (alxo) builder2.instance;
                        alxm alxmVar3 = (alxm) builder3.build();
                        alxmVar3.getClass();
                        alxoVar2.a();
                        alxoVar2.b.set(i, alxmVar3);
                        alxoVar = (alxo) builder2.build();
                    }
                }
            }
            aihf builder4 = alxiVar.toBuilder();
            aihf builder5 = alxjVar.toBuilder();
            builder5.copyOnWrite();
            alxj alxjVar2 = (alxj) builder5.instance;
            alxoVar.getClass();
            alxjVar2.c = alxoVar;
            alxjVar2.b = 60498879;
            builder4.copyOnWrite();
            alxi alxiVar2 = (alxi) builder4.instance;
            alxj alxjVar3 = (alxj) builder5.build();
            alxjVar3.getClass();
            alxiVar2.d = alxjVar3;
            alxiVar2.b |= 8;
            wgcVar.a = (alxi) builder4.build();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(hdt hdtVar) {
        Object obj = this.h;
        if (obj == null) {
            return false;
        }
        alxj alxjVar = ((wgc) obj).a.d;
        if (alxjVar == null) {
            alxjVar = alxj.a;
        }
        return Collection.EL.stream((alxjVar.b == 60498879 ? (alxo) alxjVar.c : alxo.a).b).anyMatch(new gnh(hdtVar, 3));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.f.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
        parcel.writeString(this.k);
    }

    public hel() {
        this.f = ajwo.a;
    }

    public hel(ajwo ajwoVar) {
        if (fhz.aj(ajwoVar)) {
            this.f = ajwoVar;
        } else {
            this.f = ajwo.a;
        }
    }
}
