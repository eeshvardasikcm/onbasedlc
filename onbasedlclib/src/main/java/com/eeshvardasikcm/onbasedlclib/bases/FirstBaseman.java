package com.eeshvardasikcm.onbasedlclib.bases;

/*
* XML for the strings.xml resource file
*     <string name="first_baseman">First Baseman</string>
    <string name="first_baseman_comment">Playing defensively at 1B</string>
    <string name="steps_on">Steps On</string>
    <string name="steps_on_comment">
        First Baseman steps on 1B while maintaining possession of the baseball for
        a successful defensive Put Out preventing the Batter from getting on base
    </string>
 */
abstract class FirstBaseman {
    FirstBaseman(final String nameToSet, final String commentToSet) {
        super(nameToSet, commentToSet);
        Step.On();
    }
}