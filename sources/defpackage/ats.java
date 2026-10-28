package defpackage;

import android.app.Notification;
import android.app.Person;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ats {
    static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Person b(avc avcVar) {
        Person.Builder name = new Person.Builder().setName(avcVar.a);
        IconCompat iconCompat = avcVar.b;
        return name.setIcon(iconCompat != null ? aaj.e(iconCompat, null) : null).setUri(avcVar.c).setKey(avcVar.d).setBot(avcVar.e).setImportant(avcVar.f).build();
    }

    static avc c(Person person) {
        avb avbVar = new avb();
        avbVar.a = person.getName();
        avbVar.b = person.getIcon() != null ? aaj.g(person.getIcon()) : null;
        avbVar.c = person.getUri();
        avbVar.d = person.getKey();
        avbVar.e = person.isBot();
        avbVar.f = person.isImportant();
        return new avc(avbVar);
    }

    public static void e(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        if (mediaSessionCompat$Token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) mediaSessionCompat$Token.b);
        }
    }
}
