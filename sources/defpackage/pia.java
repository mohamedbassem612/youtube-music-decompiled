package defpackage;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pia extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ List d;
    final /* synthetic */ pic e;
    final /* synthetic */ plx f;
    final /* synthetic */ String g;
    final /* synthetic */ pzn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pia(List list, pic picVar, plx plxVar, String str, pzn pznVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = list;
        this.e = picVar;
        this.f = plxVar;
        this.g = str;
        this.h = pznVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pia(this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pia) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object obj2;
        Object obj3;
        awox awoxVar = awox.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            atqp.j(obj);
        } else {
            atqp.j(obj);
            List list = this.d;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            pic picVar = this.e;
            Context context = picVar.b;
            atr atrVar = new atr(context, null);
            atrVar.H = 2;
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iBc = a.bc(((pot) it.next()).o.l);
            if (iBc == 0) {
                iBc = 1;
            }
            int iC = nwc.c(iBc);
            while (it.hasNext()) {
                int iBc2 = a.bc(((pot) it.next()).o.l);
                if (iBc2 == 0) {
                    iBc2 = 1;
                }
                int iC2 = nwc.c(iBc2);
                if (iC < iC2) {
                    iC = iC2;
                }
            }
            atrVar.l = iC;
            atrVar.q(picVar.d().a);
            plx plxVar = this.f;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                aidq aidqVar = ((pot) it2.next()).o;
                if ((aidqVar.b & 131072) != 0) {
                    String str2 = aidqVar.v;
                    str2.getClass();
                    linkedHashSet.add(str2);
                } else {
                    i++;
                }
            }
            if (linkedHashSet.size() == 1 && i == 0) {
                str = (String) atqq.W(linkedHashSet);
            } else {
                str = (plxVar != null && pic.j(plxVar) && picVar.d().g) ? plxVar.b : null;
            }
            if (str != null && str.length() != 0) {
                atrVar.s(str);
            }
            Integer num = picVar.d().c;
            if (num != null) {
                atrVar.z = context.getColor(num.intValue());
            }
            picVar.e.d(atrVar, (pot) atqq.X(list));
            int size = list.size();
            String string = context.getString(picVar.d().b);
            string.getClass();
            String quantityString = context.getResources().getQuantityString(R.plurals.public_notification_text, size, Integer.valueOf(size));
            quantityString.getClass();
            atr atrVar2 = new atr(context, null);
            atrVar2.l(string);
            atrVar2.k(quantityString);
            atrVar2.q(picVar.d().a);
            if (plxVar != null && pic.j(plxVar)) {
                atrVar2.s(plxVar.b);
            }
            Integer num2 = picVar.d().c;
            if (num2 != null) {
                atrVar2.z = context.getColor(num2.intValue());
            }
            Notification notificationA = atrVar2.a();
            notificationA.getClass();
            atrVar.B = notificationA;
            awou awouVar = picVar.j;
            phz phzVar = new phz(atrVar, picVar, this.g, plxVar, list, this.h, null);
            this.a = atrVar;
            this.b = notificationA;
            this.c = 1;
            if (awro.p(awouVar, phzVar, this) == awoxVar) {
                return awoxVar;
            }
            obj2 = notificationA;
            obj3 = atrVar;
        }
        return new pzq((atr) obj3, null, (Notification) obj2, null, null);
    }
}
