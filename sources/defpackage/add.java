package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class add {
    public static final add a;
    private static final add m;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final adg i;
    public final Set j;
    public final Set k;
    public final Set l;

    static {
        adc adcVar = new adc();
        adcVar.d = 1;
        adcVar.c();
        adcVar.i = false;
        add addVar = new add(adcVar);
        a = addVar;
        adc adcVar2 = new adc();
        adcVar2.d = 2;
        adcVar2.c();
        adcVar2.i = true;
        new add(adcVar2);
        adc adcVar3 = new adc();
        adcVar3.k = adg.a;
        adcVar3.d = 2;
        add addVar2 = new add(adcVar3);
        m = addVar2;
        adc adcVar4 = new adc(addVar2);
        adcVar4.k = adg.c;
        adcVar4.f = 2;
        adcVar4.i = true;
        new add(adcVar4);
        adc adcVar5 = new adc(addVar2);
        adcVar5.k = adg.c;
        adcVar5.f = 2;
        adcVar5.b();
        adcVar5.i = true;
        new add(adcVar5);
        adc adcVar6 = new adc(addVar2);
        adcVar6.f = 1;
        adcVar6.k = adg.d;
        adcVar6.i = true;
        adcVar6.d();
        new add(adcVar6);
        adc adcVar7 = new adc(addVar2);
        adcVar7.d = 4;
        adcVar7.f = 4;
        adcVar7.b();
        adcVar7.k = adg.e;
        adcVar7.i = true;
        adcVar7.d();
        new add(adcVar7);
        adc adcVar8 = new adc(addVar2);
        adcVar8.d = 4;
        adcVar8.b();
        adcVar8.i = true;
        adcVar8.d();
        new add(adcVar8);
        adc adcVar9 = new adc();
        adcVar9.d = 2;
        adcVar9.f = 2;
        adcVar9.b();
        adcVar9.a(1);
        adcVar9.a(Action.TYPE_MEDIA_PLAYBACK);
        adcVar9.i = true;
        new add(adcVar9);
        adc adcVar10 = new adc();
        adcVar10.d = 1;
        adcVar10.f = 1;
        adcVar10.a(1);
        adcVar10.c();
        adcVar10.i = true;
        new add(adcVar10);
        adc adcVar11 = new adc();
        adcVar11.d = 2;
        adcVar11.a(1);
        adcVar11.a(Action.TYPE_COMPOSE_MESSAGE);
        adcVar11.a(Action.TYPE_MEDIA_PLAYBACK);
        adcVar11.c();
        adcVar11.h = true;
        adcVar11.i = true;
        new add(adcVar11);
        adc adcVar12 = new adc(addVar);
        adcVar12.a.add(Integer.valueOf(Action.TYPE_APP_ICON));
        new add(adcVar12);
        adc adcVar13 = new adc();
        adcVar13.d = 1;
        adcVar13.c();
        adcVar13.f = 0;
        adcVar13.i = true;
        adcVar13.a(1);
        new add(adcVar13);
        adc adcVar14 = new adc(addVar);
        adcVar14.a(Action.TYPE_APP_ICON);
        adcVar14.a(Action.TYPE_BACK);
        adcVar14.a(1);
        new add(adcVar14);
        adc adcVar15 = new adc();
        adcVar15.a(1);
        adcVar15.c();
        adcVar15.d = 5;
        adcVar15.f = 0;
        adcVar15.b();
        adcVar15.i = true;
        new add(adcVar15);
        adc adcVar16 = new adc(addVar);
        adcVar16.a(Action.TYPE_APP_ICON);
        adcVar16.a(Action.TYPE_BACK);
        new add(adcVar16);
        adc adcVar17 = new adc();
        adcVar17.d = 1;
        adcVar17.i = true;
        adcVar17.c();
        adcVar17.a(1);
        adcVar17.f = 0;
        new add(adcVar17);
        adc adcVar18 = new adc();
        adcVar18.d = 2;
        adcVar18.f = 2;
        adcVar18.i = true;
        adcVar18.a(1);
        new add(adcVar18);
        adc adcVar19 = new adc();
        adcVar19.d = 3;
        adcVar19.f = 2;
        adcVar19.i = true;
        adcVar19.a(1);
        new add(adcVar19);
    }

    public add(adc adcVar) {
        int i = adcVar.d;
        this.b = i;
        this.c = adcVar.e;
        this.d = adcVar.f;
        this.i = adcVar.k;
        this.e = adcVar.g;
        this.f = adcVar.h;
        this.g = adcVar.i;
        this.h = adcVar.j;
        HashSet hashSet = new HashSet(adcVar.a);
        this.j = hashSet;
        HashSet hashSet2 = new HashSet(adcVar.c);
        this.l = hashSet2;
        HashSet hashSet3 = new HashSet(adcVar.b);
        hashSet3.retainAll(hashSet);
        if (!hashSet3.isEmpty()) {
            throw new IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!adcVar.b.isEmpty() && !hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.k = new HashSet(adcVar.b);
        if (hashSet.size() > i) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public final void a(List list) {
        Set set = this.j;
        Set hashSet = set.isEmpty() ? Collections.EMPTY_SET : new HashSet(set);
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        Iterator it = list.iterator();
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            Set set2 = this.k;
            if (!set2.isEmpty() && set2.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is disallowed"));
            }
            Set set3 = this.l;
            if (!set3.isEmpty() && !set3.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is not allowed"));
            }
            hashSet.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i4--;
                if (i4 < 0) {
                    throw new IllegalArgumentException(a.bP(i, "Action list exceeded max number of ", " actions with custom titles"));
                }
                this.i.a(title);
            }
            i6--;
            if (i6 < 0) {
                throw new IllegalArgumentException(a.bP(i3, "Action list exceeded max number of ", " actions"));
            }
            if ((action.getFlags() & 1) != 0 && (i5 = i5 - 1) < 0) {
                throw new IllegalArgumentException(a.bP(i2, "Action list exceeded max number of ", " primary actions"));
            }
            if (this.e && action.getIcon() == null && !action.isStandard()) {
                throw new IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            if (this.f) {
                if ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard()) {
                    throw new IllegalArgumentException("Non-standard actions without a background color are disallowed");
                }
            } else if (!CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.h && (action.getFlags() & 1) == 0) {
                throw new IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.g && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(',');
        }
        sb.toString();
        throw new IllegalArgumentException("Missing required action types: ".concat(sb.toString()));
    }
}
