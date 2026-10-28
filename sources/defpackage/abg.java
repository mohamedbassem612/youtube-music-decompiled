package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abg {
    public boolean a;
    public ItemList b;
    public final List c;
    public CarText d;
    public Action e;
    public ActionStrip f;
    public final List g;
    public Header h;

    public abg(ListTemplate listTemplate) {
        this.a = listTemplate.isLoading();
        this.e = listTemplate.getHeaderAction();
        this.d = listTemplate.getTitle();
        this.b = listTemplate.getSingleList();
        this.c = new ArrayList(listTemplate.getSectionedLists());
        this.f = listTemplate.getActionStrip();
        this.g = new ArrayList(listTemplate.getActions());
        this.h = listTemplate.getHeader();
    }

    public abg() {
        this.c = new ArrayList();
        this.g = new ArrayList();
    }
}
