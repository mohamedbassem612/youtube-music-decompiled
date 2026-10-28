package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iun implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iun(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v63, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [aunn, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        byte[] bArr = null;
        boolean z = false;
        z = true;
        boolean z2 = true;
        switch (this.$cid) {
            case 0:
                List<anuk> list = (List) obj;
                int size = list.size();
                iuo iuoVar = (iuo) this.a;
                iuoVar.m.aj(3, 2, size);
                ArrayList arrayList = new ArrayList(list.size());
                for (anuk anukVar : list) {
                    Cursor cursorQuery = iuoVar.e.query(ixt.o(Uri.parse(hef.p(anukVar))), ish.h, "is_music=1 AND title IS NOT NULL", null, "play_order");
                    ArrayList arrayList2 = new ArrayList();
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("title"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("artist"));
                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("duration"));
                            long j = TextUtils.isEmpty(string3) ? 0L : Long.parseLong(string3);
                            String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                            atvx atvxVar = new atvx();
                            atvxVar.l(string);
                            atvxVar.j(string2);
                            atvxVar.k(j / 1000);
                            atvxVar.i(string4);
                            arrayList2.add(atvxVar.h());
                        } catch (Throwable th) {
                            jku.b(cursorQuery);
                            throw th;
                        }
                        break;
                    }
                    jku.b(cursorQuery);
                    isw iswVar = new isw();
                    iswVar.b(anukVar.getTitle());
                    iswVar.c(arrayList2);
                    arrayList.add(iswVar.a());
                }
                return arrayList;
            case 1:
                aimq aimqVar = (aimq) obj;
                ((iuo) this.a).l.af(aimqVar.d, aimqVar.e);
                return null;
            case 2:
                return kiz.a(((Boolean) obj).booleanValue(), ((kkf) this.a).c.b);
            case 3:
                return this.a.invoke(obj);
            case 4:
                return Boolean.valueOf(((awri) this.a).a);
            case 5:
                return this.a.invoke(obj);
            case 6:
                return (ainw) ((awrm) this.a).a;
            case 7:
                obo oboVar = (obo) obj;
                int i = oboVar.f;
                int iBf = a.bf(i);
                if (iBf == 0) {
                    iBf = 1;
                }
                Object obj2 = this.a;
                int i2 = iBf - 1;
                if (i2 == 1 || i2 == 2) {
                    return oboVar;
                }
                if (i2 == 3) {
                    omj omjVar = ((odx) obj2).e;
                    int iBf2 = a.bf(i);
                    if (iBf2 == 0) {
                        iBf2 = 1;
                    }
                    omjVar.k(1004, String.valueOf(iBf2 - 1));
                    int iBf3 = a.bf(oboVar.f);
                    throw new odv((iBf3 != 0 ? iBf3 : 1) - 1);
                }
                if (i2 != 12) {
                    omj omjVar2 = ((odx) obj2).e;
                    int iBf4 = a.bf(i);
                    if (iBf4 == 0) {
                        iBf4 = 1;
                    }
                    omjVar2.k(1005, String.valueOf(iBf4 - 1));
                    int iBf5 = a.bf(oboVar.f);
                    throw new odu((iBf5 != 0 ? iBf5 : 1) - 1);
                }
                omj omjVar3 = ((odx) obj2).e;
                int iBf6 = a.bf(i);
                if (iBf6 == 0) {
                    iBf6 = 1;
                }
                omjVar3.k(1005, String.valueOf(iBf6 - 1));
                int iBf7 = a.bf(oboVar.f);
                throw new odt((iBf7 != 0 ? iBf7 : 1) - 1);
            case 8:
                obp obpVar = (obp) obj;
                Object obj3 = this.a;
                if (obpVar == null || obpVar.equals(obp.a)) {
                    ((omj) ((ablj) obj3).b).j(15104);
                } else {
                    gcw gcwVarA = gcw.a(obpVar.e);
                    if (gcwVarA == null) {
                        gcwVarA = gcw.UNSUPPORTED;
                    }
                    ablj abljVar = (ablj) obj3;
                    if (gcwVarA != abljVar.c.io()) {
                        ((omj) abljVar.b).j(15105);
                    } else {
                        z = ((obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).e * 1000) - System.currentTimeMillis() <= abljVar.a;
                        if (z) {
                            ((omj) abljVar.b).j(15106);
                        }
                        z2 = z;
                    }
                }
                return Boolean.valueOf(z2);
            case 9:
                obp obpVar2 = (obp) obj;
                aczl aczlVar = (aczl) this.a;
                Object obj4 = aczlVar.e;
                if (obpVar2 == null || obpVar2.equals(obp.a)) {
                    ((omj) ((ablj) obj4).b).j(15102);
                } else {
                    gcw gcwVarA2 = gcw.a(obpVar2.e);
                    if (gcwVarA2 == null) {
                        gcwVarA2 = gcw.UNSUPPORTED;
                    }
                    ablj abljVar2 = (ablj) obj4;
                    if (gcwVarA2 == abljVar2.c.io()) {
                        return Boolean.TRUE;
                    }
                    ((omj) abljVar2.b).j(15103);
                }
                ((omj) aczlVar.g).j(15003);
                throw new oef(1);
            case 10:
                aepb aepbVar = (aepb) obj;
                if (aepbVar == null) {
                    throw new oef(3);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    ((File) aepbVar.b).setReadOnly();
                }
                Object obj5 = this.a;
                ((omj) ((aczl) obj5).g).l(15002, new msh(obj5, aepbVar, 11, bArr));
                return Boolean.TRUE;
            case 11:
                gcw gcwVar = (gcw) obj;
                if (kwj.a(gcwVar)) {
                    return 0;
                }
                ((omj) ((aczl) this.a).b).k(15204, gcwVar.name());
                throw new oei();
            case 12:
                ohp ohpVar = (ohp) obj;
                if (ohpVar == null) {
                    return ohpVar;
                }
                Object obj6 = this.a;
                aihf aihfVarCreateBuilder = ahai.a.createBuilder();
                String str = ohpVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
                str.getClass();
                ahaiVar.b |= 1;
                ahaiVar.c = str;
                String str2 = ohpVar.d;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
                str2.getClass();
                ahaiVar2.b |= 4;
                ahaiVar2.e = str2;
                int i3 = ohpVar.f;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
                ahaiVar3.b |= 2;
                ahaiVar3.d = i3;
                int size2 = ohpVar.h.size();
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
                ahaiVar4.b |= 8;
                ahaiVar4.f = size2;
                String str3 = ohpVar.j;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.instance;
                str3.getClass();
                ahaiVar5.b |= SemanticState.Focused;
                ahaiVar5.j = str3;
                long j2 = ohpVar.i;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar6 = (ahai) aihfVarCreateBuilder.instance;
                ahaiVar6.b |= 64;
                ahaiVar6.i = j2;
                ((ong) ((zpw) obj6).k).g((ahai) aihfVarCreateBuilder.build());
                return ohpVar;
            case 13:
                return new omi((oip) this.a, (oip) obj);
            case 14:
                ohp ohpVar2 = (ohp) obj;
                Object obj7 = this.a;
                if (ohpVar2 == null) {
                    return obj7;
                }
                ((agjz) obj7).h(ohpVar2);
                return obj7;
            case 15:
                return (ohp) ((aihf) this.a).build();
            case 16:
                Uri uri = (Uri) obj;
                if (uri == null) {
                    return null;
                }
                this.a.add(uri);
                return null;
            case 17:
                return this.a;
            case 18:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj8 = this.a;
                oio oioVar = ((oip) obj8).c;
                if (oioVar == null) {
                    oioVar = oio.a;
                }
                aihf builder = oioVar.toBuilder();
                builder.copyOnWrite();
                oio oioVar2 = (oio) builder.instance;
                oioVar2.b |= 64;
                oioVar2.i = zBooleanValue;
                oio oioVar3 = (oio) builder.build();
                aihf builder2 = ((aihn) obj8).toBuilder();
                builder2.copyOnWrite();
                oip oipVar = (oip) builder2.instance;
                oioVar3.getClass();
                oipVar.c = oioVar3;
                oipVar.b |= 1;
                return (oip) builder2.build();
            case 19:
                return (agkj) Collection.EL.stream((List) obj).collect(aghu.a(new ixa(19), new iuk(this.a, 9)));
            default:
                if (((Boolean) obj).booleanValue() && ((Boolean) this.a).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
