package kiosh.tony.Invoice_generator.model;

// This is a public class named invoiceRecord
/*
Here's the record that's supposed to be replicated:
{"from":"Nikolaus Ltd","to":"Acme, Corp.","logo":"https://example.com/img/logo-invoice.png","number":1,"items":[{"name":"Starter plan","quantity":1,"unit_cost":99}],"notes":"Thanks for your business!"}

if the above might have been a record here's how it would look like:
record invoiceRecord(
        String from,
        String to,
        String logo,
        int number,
        List<Items> items,
        String notes

Here's an example of a request body that would be sent to the server:
  -d from="Nikolaus Ltd%0AVAT ID: 1234" \
  -d to="Foster Moen%0AVAT ID: 4567" \
  -d logo="https://example.com/img/logo-invoice.png" \
  -d number=1 \
  -d date="Feb 9, 2015" \
  -d date="Mar 9, 2015" \
  -d payment_terms="NET 30" \
  -d "items[0][name]"="Starter Plan Monthly" \
  -d "items[0][quantity]"=1 \
  -d "items[0][unit_cost]"=99 \
  -d tax_title="VAT" \
  -d "fields[tax]"="%" \
  -d tax=8 \
  -d notes="Thanks for being an awesome customer\!" \

  The record equivalent that would cater for all the fields in the body would be:
    record invoiceRecord(

    )

 */

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public record invoiceRecord(
        String from,
        String to,
        String logo,
        int number,
        List<items> items,
        String notes,
        String date,
        String payment_terms,
        String tax_title,
        String fields,
        int tax
) {
}
