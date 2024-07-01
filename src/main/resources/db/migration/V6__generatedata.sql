alter table book rename column theme to title;
alter table book rename column userjon to author;
alter table book rename column created_by to publisher;
alter table book drop column tt;


insert into book(title, author, publisher)
select 'titlejon' || generate_series,
       'authorjon' || generate_series,
       'pubjon' || generate_series
from generate_series(0, 100)