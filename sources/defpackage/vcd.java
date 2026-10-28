package defpackage;

import android.text.Spanned;
import android.widget.Filter;
import android.widget.TextView;
import com.google.android.libraries.youtube.creation.geo.LocationSearchView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcd extends Filter {
    public amth a;
    private Spanned b;
    private final LocationSearchView c;
    private final aend d;

    public vcd(aend aendVar, LocationSearchView locationSearchView) {
        this.d = aendVar;
        this.c = locationSearchView;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, zwb] */
    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        alay alayVar;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        aihf aihfVarCreateBuilder = aluk.a.createBuilder();
        String string = charSequence == null ? "" : charSequence.toString();
        aihfVarCreateBuilder.copyOnWrite();
        aluk alukVar = (aluk) aihfVarCreateBuilder.instance;
        string.getClass();
        alukVar.b |= 4;
        alukVar.e = string;
        amth amthVar = this.a;
        if (amthVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aluk alukVar2 = (aluk) aihfVarCreateBuilder.instance;
            alukVar2.d = amthVar;
            alukVar2.b |= 2;
        }
        try {
            aend aendVar = this.d;
            Object obj = aendVar.c;
            wqc wqcVar = new wqc(aendVar.b, aendVar.d.e(), aihfVarCreateBuilder);
            wqcVar.o(vzh.b);
            alul alulVar = (alul) ((wnh) obj).c(wqcVar);
            ArrayList arrayList = new ArrayList(alulVar.d.size());
            for (apji apjiVar : alulVar.d) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aniq.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                anip anipVar = (anip) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                if ((anipVar.b & 2) != 0) {
                    arrayList.add(anipVar);
                } else {
                    ((agrc) ((agrc) vce.a.b()).k("com/google/android/libraries/youtube/creation/geo/LocationSearchController$PlaceFilter", "performFiltering", 174, "LocationSearchController.java")).w("Empty place received: %s", anipVar.c);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = alulVar.d.size();
            if ((alulVar.b & 2) != 0) {
                alayVar = alulVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            this.b = ackj.k(null, alayVar, null, false);
        } catch (wno e) {
            ((agrc) ((agrc) ((agrc) vce.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/geo/LocationSearchController$PlaceFilter", "performFiltering", (char) 162, "LocationSearchController.java")).t("Failed to fetch autocomplete results.");
            this.b = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults.values == null) {
            this.c.b(Collections.EMPTY_LIST);
            return;
        }
        ArrayList arrayList = (ArrayList) filterResults.values;
        boolean zIsEmpty = arrayList.isEmpty();
        LocationSearchView locationSearchView = this.c;
        if (!zIsEmpty) {
            locationSearchView.b(arrayList);
            return;
        }
        Spanned spanned = this.b;
        TextView textView = locationSearchView.c;
        textView.setText(spanned);
        locationSearchView.b.setVisibility(8);
        textView.setVisibility(0);
    }
}
