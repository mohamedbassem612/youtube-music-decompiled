package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class guq extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/MusicBrowseFormBinderCommandResolver");
    private final vxe b;
    private aigj c;
    private Map d;
    private final hcb e;

    public guq(vxe vxeVar, hcb hcbVar) {
        this.b = vxeVar;
        this.e = hcbVar;
    }

    private final void d(List list, List list2, List list3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            anop anopVar = (anop) this.e.b((String) it.next(), anop.class);
            if (anopVar != null) {
                boolean zBooleanValue = anopVar.getSelected().booleanValue();
                String opaqueToken = anopVar.getOpaqueToken();
                if (zBooleanValue) {
                    list2.add(opaqueToken);
                }
                list3.add(opaqueToken);
            }
        }
    }

    private final void e(anle anleVar, List list, List list2) {
        ajmf ajmfVar = anleVar.c;
        if (ajmfVar == null) {
            ajmfVar = ajmf.a;
        }
        aihf builder = ajmfVar.toBuilder();
        ajmi ajmiVar = ((ajmf) builder.instance).h;
        if (ajmiVar == null) {
            ajmiVar = ajmi.a;
        }
        aihf builder2 = ajmiVar.toBuilder();
        builder2.copyOnWrite();
        ajmi ajmiVar2 = (ajmi) builder2.instance;
        ajmiVar2.b();
        aifs.addAll(list, ajmiVar2.d);
        builder2.copyOnWrite();
        ajmi ajmiVar3 = (ajmi) builder2.instance;
        ajmiVar3.a();
        aifs.addAll(list2, ajmiVar3.e);
        builder.copyOnWrite();
        ajmf ajmfVar2 = (ajmf) builder.instance;
        ajmi ajmiVar4 = (ajmi) builder2.build();
        ajmiVar4.getClass();
        ajmfVar2.h = ajmiVar4;
        ajmfVar2.b |= 64;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ajmj.a, (ajmf) builder.build());
        aigj aigjVar = this.c;
        if (aigjVar != null) {
            aihhVar.copyOnWrite();
            ajwo ajwoVar = (ajwo) aihhVar.instance;
            ajwoVar.b |= 1;
            ajwoVar.c = aigjVar;
        }
        this.b.c((ajwo) aihhVar.build(), this.d);
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anlf.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        anle anleVar = (anle) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        this.c = ajwoVar.c;
        this.d = map;
        if ((anleVar.b & 2) != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str = anleVar.d;
            hcb hcbVar = this.e;
            anos anosVar = (anos) hcbVar.b(str, anos.class);
            if (anosVar != null) {
                d(anosVar.e(), arrayList, arrayList2);
                Iterator it = anosVar.f().iterator();
                while (it.hasNext()) {
                    anov anovVar = (anov) hcbVar.b((String) it.next(), anov.class);
                    if (anovVar != null) {
                        d(anovVar.e(), arrayList, arrayList2);
                    }
                }
                e(anleVar, arrayList, arrayList2);
                return;
            }
            return;
        }
        if (map == null) {
            ((agrc) ((agrc) a.c().i(agso.a, "MusicBrowseFormBinder")).k("com/google/android/apps/youtube/music/command/MusicBrowseFormBinderCommandResolver", "resolve", 156, "MusicBrowseFormBinderCommandResolver.java")).t("Form submitted but no form data available");
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (map.containsKey("selection_values")) {
            Object obj = map.get("selection_values");
            if (obj instanceof List) {
                arrayList3.addAll(aguu.u((List) obj, new cbs(10)));
            }
        }
        if (map.containsKey("impression_values")) {
            Object obj2 = map.get("impression_values");
            if (obj2 instanceof List) {
                arrayList4.addAll(aguu.u((List) obj2, new cbs(11)));
            }
        }
        e(anleVar, arrayList3, arrayList4);
    }
}
