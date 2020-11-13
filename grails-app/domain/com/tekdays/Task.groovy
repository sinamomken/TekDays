package com.tekdays

import com.sun.org.apache.xpath.internal.operations.Bool

class Task {
    String title
    String notes
    TekUser assignedTo
    Date dueDate
    TekEvent event
    Boolean completed = false

    static constraints = {
        title blank: false
        notes blank: true, nullable: true, maxSize: 5000
        assignedTo nullable: true
        dueDate nullable: true
        completed nullable: false
    }

    static belongsTo = TekEvent
}
