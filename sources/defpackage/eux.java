package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eux extends eut {
    private static final UriMatcher b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    private static final InputStream h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.euh
    public final Class a() {
        return InputStream.class;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    @Override // defpackage.eut
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        Uri uriLookupContact;
        InputStream inputStreamH;
        int iMatch = b.match(uri);
        if (iMatch == 1) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamH = h(contentResolver, uriLookupContact);
        } else if (iMatch == 3) {
            inputStreamH = h(contentResolver, uri);
        } else if (iMatch == 5) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamH = h(contentResolver, uriLookupContact);
        } else if (this.a && ept.q(uri) && ept.p()) {
            AssetFileDescriptor assetFileDescriptorO = ept.o(uri, contentResolver);
            if (assetFileDescriptorO == null) {
                throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                inputStreamH = assetFileDescriptorO.createInputStream();
            } catch (IOException e) {
                try {
                    assetFileDescriptorO.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e));
            }
        } else {
            inputStreamH = contentResolver.openInputStream(uri);
        }
        if (inputStreamH != null) {
            return inputStreamH;
        }
        throw new FileNotFoundException("InputStream is null for ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.eut
    protected final /* synthetic */ void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
