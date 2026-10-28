package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aihl extends aigw {
    public final MessageLite a;
    public final Object b;
    public final MessageLite c;
    public final aihk d;

    public aihl(MessageLite messageLite, Object obj, MessageLite messageLite2, aihk aihkVar) {
        if (messageLite == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (aihkVar.c == aika.MESSAGE && messageLite2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = messageLite;
        this.b = obj;
        this.c = messageLite2;
        this.d = aihkVar;
    }

    @Override // defpackage.aigw
    public final int a() {
        return this.d.b;
    }

    public final aika b() {
        return this.d.c;
    }

    public final Object c(Object obj) {
        aihk aihkVar = this.d;
        if (!aihkVar.d) {
            return d(obj);
        }
        if (aihkVar.a() != aikb.h) {
            return obj;
        }
        aija aijaVar = new aija(aija.a, 0, true);
        List list = (List) obj;
        aijaVar.d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aijaVar.add(d(it.next()));
        }
        aijaVar.b();
        return aijaVar;
    }

    final Object d(Object obj) {
        aihk aihkVar = this.d;
        if (aihkVar.a() != aikb.h) {
            return obj;
        }
        return aihkVar.a.findValueByNumber(((Integer) obj).intValue());
    }

    final Object e(Object obj) {
        return this.d.a() == aikb.h ? Integer.valueOf(((aihr) obj).getNumber()) : obj;
    }

    public final boolean f() {
        return this.d.d;
    }
}
