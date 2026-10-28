package defpackage;

import android.content.res.Resources;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.SectionedItemList;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.model.Toggle;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ya implements bog {
    public final xr a;
    public final boh b = new boh(this);
    public TemplateWrapper c;
    public boolean d;
    private final ahgb e;

    public ya(xr xrVar, ahgb ahgbVar) {
        this.a = xrVar;
        this.e = ahgbVar;
        xrVar.a.c(this, new hhf(this));
    }

    public final void a(boa boaVar) {
        afi.b(new bg((Object) this, (Object) boaVar, 15, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r13v6, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aunn, java.lang.Object] */
    public final acz b() {
        abd abdVar = new abd();
        acc accVar = new acc();
        xr xrVar = this.a;
        accVar.c(xrVar.getString(R.string.pref_offline_storage_title));
        final ahgb ahgbVar = this.e;
        Resources resources = xrVar.getResources();
        ?? r4 = ahgbVar.e;
        final int i = 1;
        final int i2 = 0;
        String string = resources.getString(R.string.pref_offline_storage_free, typ.h(resources, ((abxv) r4.io()).b() / 1048576));
        Resources resources2 = xrVar.getResources();
        accVar.b(string + ",  " + resources2.getString(R.string.pref_offline_storage_used, typ.h(resources2, ((abxv) r4.io()).a() / 1048576)));
        abdVar.b(accVar.a());
        if (isi.a(xrVar)) {
            ada adaVar = new ada(new adb() { // from class: hhe
                /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v10, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v7, types: [aunn, java.lang.Object] */
                @Override // defpackage.adb
                public final void a(boolean z) {
                    int i3 = i2;
                    if (i3 != 0) {
                        ahgb ahgbVar2 = ahgbVar;
                        if (i3 != 1) {
                            ((hnq) ahgbVar2.d.io()).d(z);
                            return;
                        } else {
                            ((hlp) ahgbVar2.a.io()).g(z);
                            return;
                        }
                    }
                    ahgb ahgbVar3 = ahgbVar;
                    ((hlp) ahgbVar3.a.io()).h(z);
                    Object obj = ((yu) ahgbVar3.b).a;
                    if (obj != null) {
                        ((awku) obj).kk(zlw.a);
                    }
                }
            });
            adaVar.b = ((hlp) ahgbVar.a.io()).m();
            Toggle toggle = new Toggle(adaVar);
            acc accVar2 = new acc();
            accVar2.c(xrVar.getString(R.string.pref_show_device_files));
            accVar2.b(xrVar.getString(R.string.pref_show_device_files_summary));
            accVar2.h = toggle;
            abdVar.b(accVar2.a());
        }
        ada adaVar2 = new ada(new adb() { // from class: hhe
            /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v10, types: [aunn, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v7, types: [aunn, java.lang.Object] */
            @Override // defpackage.adb
            public final void a(boolean z) {
                int i3 = i;
                if (i3 != 0) {
                    ahgb ahgbVar2 = ahgbVar;
                    if (i3 != 1) {
                        ((hnq) ahgbVar2.d.io()).d(z);
                        return;
                    } else {
                        ((hlp) ahgbVar2.a.io()).g(z);
                        return;
                    }
                }
                ahgb ahgbVar3 = ahgbVar;
                ((hlp) ahgbVar3.a.io()).h(z);
                Object obj = ((yu) ahgbVar3.b).a;
                if (obj != null) {
                    ((awku) obj).kk(zlw.a);
                }
            }
        });
        adaVar2.b = ((hlp) ahgbVar.a.io()).j();
        Toggle toggle2 = new Toggle(adaVar2);
        acc accVar3 = new acc();
        accVar3.c(xrVar.getString(R.string.pref_offline_mixtape_only_wifi));
        accVar3.h = toggle2;
        abdVar.b(accVar3.a());
        if (((jnm) ahgbVar.c).C()) {
            final int i3 = 2;
            ada adaVar3 = new ada(new adb() { // from class: hhe
                /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v10, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v7, types: [aunn, java.lang.Object] */
                @Override // defpackage.adb
                public final void a(boolean z) {
                    int i4 = i3;
                    if (i4 != 0) {
                        ahgb ahgbVar2 = ahgbVar;
                        if (i4 != 1) {
                            ((hnq) ahgbVar2.d.io()).d(z);
                            return;
                        } else {
                            ((hlp) ahgbVar2.a.io()).g(z);
                            return;
                        }
                    }
                    ahgb ahgbVar3 = ahgbVar;
                    ((hlp) ahgbVar3.a.io()).h(z);
                    Object obj = ((yu) ahgbVar3.b).a;
                    if (obj != null) {
                        ((awku) obj).kk(zlw.a);
                    }
                }
            });
            adaVar3.b = ((hnq) ahgbVar.d.io()).g();
            Toggle toggle3 = new Toggle(adaVar3);
            acc accVar4 = new acc();
            accVar4.c(xrVar.getString(R.string.auto_offline_title));
            accVar4.b(xrVar.getString(R.string.smart_downloads_education_brief_shelf_description));
            accVar4.h = toggle3;
            abdVar.b(accVar4.a());
        }
        abg abgVar = new abg();
        abgVar.b = abdVar.a();
        List list = abgVar.c;
        list.clear();
        String string2 = xrVar.getString(R.string.settings);
        string2.getClass();
        abgVar.d = CarText.create(string2);
        adg.d.a(abgVar.d);
        Action action = Action.BACK;
        add addVar = add.a;
        action.getClass();
        addVar.a(Collections.singletonList(action));
        abgVar.e = action;
        if (abgVar.b == null && list.isEmpty()) {
            i = 0;
        }
        if (abgVar.a == i) {
            throw new IllegalStateException("Template is in a loading state but lists are added, or vice versa");
        }
        if (i != 0) {
            if (!list.isEmpty()) {
                adk adkVar = adk.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ItemList itemList = ((SectionedItemList) it.next()).getItemList();
                    if (itemList.getOnSelectedDelegate() != null && !adkVar.e) {
                        throw new IllegalArgumentException("Selectable lists are not allowed");
                    }
                    arrayList.addAll(itemList.getItems());
                }
                adkVar.a(arrayList);
            } else if (abgVar.b != null) {
                adk adkVar2 = adk.b;
                ItemList itemList2 = abgVar.b;
                if (itemList2.getOnSelectedDelegate() != null && !adkVar2.e) {
                    throw new IllegalArgumentException("Selectable lists are not allowed");
                }
                adkVar2.a(itemList2.getItems());
            }
        }
        if (list.isEmpty()) {
            ItemList itemList3 = abgVar.b;
            if (itemList3 != null) {
                abgVar.b = ListTemplate.truncate(itemList3, new abh());
            }
        } else {
            List truncatedCopy = ListTemplate.getTruncatedCopy(list);
            list.clear();
            list.addAll(truncatedCopy);
        }
        return new ListTemplate(abgVar);
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return this.b;
    }
}
